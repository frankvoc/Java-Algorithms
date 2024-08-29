public class SMSSubscriber implements Subscriber{
    private String phoneNum;
    public SMSSubscriber(String phoneNum){
        this.phoneNum = phoneNum;
    }
    public void update(String news){
        System.out.println("Sending SMS to: " + phoneNum + " " + news);
    }
}
