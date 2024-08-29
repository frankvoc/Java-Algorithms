public interface NewsPublisher {
    void notifySubs(String news);
    void sub (Subscriber subscriber);
    void unsub (Subscriber subscriber);
}
