package Observer.Youtube;

public class SubscriberImpl implements ISubscriber {

    String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void update(String channelName, String videoTitle) {
        System.out.println("Hey " + name + "! " + channelName + " just uploaded a new video: " + videoTitle);
    }
}
