import java.util.ArrayList;
import java.util.List;
public class BusinessNewsPublisher implements NewsPublisher {
    private List<Subscriber> subscribers = new ArrayList<>();
    public void sub(Subscriber subscriber){
        subscribers.add(subscriber);
        } 
    public void unsub(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubs(String news){
        for(Subscriber subscriber : subscribers){
            subscriber.update(news);
        }
    }
}
