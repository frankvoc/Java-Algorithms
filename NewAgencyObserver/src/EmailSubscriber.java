public class EmailSubscriber implements Subscriber{
    private String email;
    public EmailSubscriber(String email){
        this.email = email;
    }
    public void update(String news){
        System.out.println("Sending email to: " + email + " " + news);
    }
}
