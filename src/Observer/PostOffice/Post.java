package Observer.PostOffice;

public class Post {
    private String name;   // Name of the customer the post is addressed to
    private String address;
    private String content;

    public Post(String name, String address, String content) {
        this.name = name;
        this.address = address;
        this.content = content;
    }

    // Getters for the private fields
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContent() {
        return content;
    }
}
