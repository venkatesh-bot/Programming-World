package scheduler;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TokenDemo {
    private final Map<String, UserBean> activeSession = new ConcurrentHashMap<>();
    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd,yyyy HH:mm:ss");
        System.out.println("start time  --> " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
        TokenService tokenService = new TokenService();
        // Below thread will call clearToken() method every 10 seconds
        ScheduledExecutorService ses = Executors.newScheduledThreadPool(1);
        Runnable task = tokenService::clearToken;
        ses.scheduleAtFixedRate(task, 0, 21, TimeUnit.SECONDS);

        // Below thread will call setToken() method every 5 seconds
        ScheduledExecutorService ses1 = Executors.newScheduledThreadPool(1);
        Runnable task1 = tokenService::setToken;
        ses1.scheduleAtFixedRate(task1, 0, 5, TimeUnit.SECONDS);
        System.out.println("end Time --> " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
    }

    public void method() throws JWTVerificationException, UnsupportedEncodingException {
        JWTVerifier scanner = JWT.require(Algorithm.HMAC256("tsg")).build();
        System.out.println(scanner);
        System.out.println(activeSession);
        //JWT ticketInfo = (JWT) JWTVerifier.verify("");
        method2();
    }

    public void method2() throws UnsupportedEncodingException {
        UserBean userBean = new UserBean();
        System.out.println(userBean);
        System.out.println(Thread.currentThread());
        method();
    }
}
