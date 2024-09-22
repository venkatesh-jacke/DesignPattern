package Observer.PostOffice;

import java.util.List;

public interface Observer {
    void update(Post post);  // Customer will receive a list of posts.
}