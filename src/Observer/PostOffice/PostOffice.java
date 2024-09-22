package Observer.PostOffice;

import java.util.ArrayList;
import java.util.List;

public class PostOffice implements Subject {
    private List<Observer> customers = new ArrayList<>();

    @Override
    public void attach(Observer o) {
        customers.add(o);
    }

    @Override
    public void detach(Observer o) {
        customers.remove(o);
    }

    @Override
    public void notifyObservers(Post post) {  // Notify with a single post
        for (Observer customer : customers) {
            customer.update(post);  // Pass only the latest post to each customer
        }
    }

    public void addPost(Post post) {
        notifyObservers(post);  // Notify customers only with the latest post
    }
}
