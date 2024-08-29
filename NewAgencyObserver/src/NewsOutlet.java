public class NewsOutlet {
    public static void main(String[] args) {
        //create news outlet
        NewsPublisher publish = new BusinessNewsPublisher();
        //create subscribers
        Subscriber emailSubscriber = new EmailSubscriber("fmvocatura@email.neit.edu");

        Subscriber smsSubscriber = new SMSSubscriber("401-123-4567");

        publish.sub(emailSubscriber);
        publish.sub(smsSubscriber);

        publish.notifySubs("This is some crazy news!");
        publish.notifySubs("NVIDIA Reports Earnings");
        publish.unsub(smsSubscriber);
        publish.notifySubs("News about Trump!");

    } 
}
