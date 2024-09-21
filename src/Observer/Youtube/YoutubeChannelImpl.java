package Observer.Youtube;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements IChannel {
    String channelName;

    public YoutubeChannelImpl(String channelName) {
        this.channelName = channelName;
    }

    List<ISubscriber> subscriberList = new ArrayList<>();

    @Override
    public void subscribe(ISubscriber subscriber) {
        subscriberList.add(subscriber);
        System.out.println(subscriber.getName() + " subscribed to " + channelName);

    }

    @Override
    public void unSubscribe(ISubscriber subscriber) {
        subscriberList.remove(subscriber);
        System.out.println(subscriber.getName() + " unsubscribed from " + channelName);

    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (ISubscriber subscriber : subscriberList) {
            subscriber.update(channelName, videoTitle);
        }
    }


    @Override
    public void uploadVideo(String videoTitle) {
        //System.out.println(channelName + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}
