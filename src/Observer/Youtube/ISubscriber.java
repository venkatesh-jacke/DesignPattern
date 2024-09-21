package Observer.Youtube;


// The Observer interface (Subscriber)
public interface ISubscriber {
    void update(String channelName, String videoTitle);

    String getName();
}
