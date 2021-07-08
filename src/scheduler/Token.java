package scheduler;

public class Token {
    private final String ticket;
    private final long ttl;

    public Token(String ticket, long ttl) {
        this.ticket = ticket;
        this.ttl = ttl;
    }

    public String getTicket() {
        return ticket;
    }

    public long getTtl() {
        return ttl;
    }

    @Override
    public String toString() {
        return ticket;
    }

    @Override
    public int hashCode() {
        return this.ticket.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return ticket.equals(token.ticket);
    }
}
