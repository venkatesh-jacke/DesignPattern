package Observer.Youtube;


// The Subject interface (YouTubeChannel)
public interface IChannel {
    void subscribe(ISubscriber subscriber);
    void unSubscribe(ISubscriber subscriber);
    void notifySubscribers(String videoTitle);
    void uploadVideo(String videoTitle);
}
