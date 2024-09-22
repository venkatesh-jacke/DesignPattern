package Observer.PostOffice;

public class Main {
    public static void main(String[] args) {
        PostOffice postOffice= new PostOffice();

        Customer venki= new Customer("venki");
        Customer jacke= new Customer("jacke");
        Customer kalai= new Customer("kalai");
        Customer vani= new Customer("vani");

        postOffice.attach(venki);
        postOffice.attach(jacke);
        postOffice.attach(kalai);
        postOffice.attach(vani);

        Post post1= new Post("venki","chennai","hello");
        Post post2= new Post("jacke","USA","world");
        Post post3= new Post("kalai","cannada","hi");
        Post post4= new Post("vani","france","ji");

        postOffice.addPost(post1);
        postOffice.addPost(post3);
//        postOffice.addPost(post1);
//        postOffice.addPost(post1);
    }
}
