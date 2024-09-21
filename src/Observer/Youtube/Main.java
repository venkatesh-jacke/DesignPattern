package Observer.Youtube;

public class Main {
    public static void main(String[] args) {
        YoutubeChannelImpl teluskoChannel = new YoutubeChannelImpl("telusko");

        ISubscriber jacke = new SubscriberImpl("jacke");
        ISubscriber venki = new SubscriberImpl("venki");
        ISubscriber kalai = new SubscriberImpl("kalai");
        ISubscriber vani = new SubscriberImpl("vani");

        teluskoChannel.subscribe(jacke);
        teluskoChannel.subscribe(venki);
        teluskoChannel.subscribe(kalai);
        teluskoChannel.subscribe(vani);

        teluskoChannel.uploadVideo("Observer Pattern Tutorial");
        teluskoChannel.unSubscribe(kalai);
        teluskoChannel.uploadVideo("Strategy Pattern Tutorial");

    }
}
