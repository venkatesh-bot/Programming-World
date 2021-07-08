package scheduler;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.concurrent.*;

public class TokenService {
    private final Map<Token, Integer> tokenMap = new ConcurrentHashMap<>();
    private int count = 0;

    public void setToken() {
        System.out.println("called set token and tokens " + this.tokenMap.keySet());
        LocalDateTime dateTime = LocalDateTime.now().plus(2, ChronoUnit.HOURS);
        System.out.println(dateTime);
        Token token = new Token("ticket" + count, Instant.now().toEpochMilli() + 15 * 1000);
        this.tokenMap.put(token, count);
        count++;
    }

    public void clearToken() {
        System.out.println("called clear token at " + LocalDateTime.now() + "," + this.tokenMap.size());
        System.out.println();
        if (this.tokenMap.size() > 0) {
            for (Map.Entry<Token, Integer> val : this.tokenMap.entrySet()) {
                //1625142433882 1625142438884
                //System.out.println(val.getKey().getTtl()+" "+Instant.now().toEpochMilli());
                if (val.getKey().getTtl() < Instant.now().toEpochMilli()) {
                    this.tokenMap.remove(val.getKey());
                    System.out.println("cleared token is " + val.getKey().getTicket());
                }
            }
        }
    }

    public void process() {
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task2 = this::clearToken;
        ses.schedule(task2, 5, TimeUnit.SECONDS);
        CompletableFuture.runAsync(() -> System.out.println("Running task2..."), ses);
    }
}
