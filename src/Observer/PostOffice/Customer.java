package Observer.PostOffice;

import java.util.List;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(Post post) {
        // Only notify the customer if the post is addressed to them
        if (post.getName().equals(name)) {
            System.out.println(name + " received a post: " + post.getContent());
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
