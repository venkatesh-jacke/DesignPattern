package Singleton.Example1;

public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            Singleton object1 = Singleton.getInstance();
            System.out.println(object1.hashCode());
        });
        Thread t2 = new Thread(() -> {
            Singleton object2 = Singleton.getInstance();
            System.out.println(object2.hashCode());
        });

        t1.start();
        t2.start();
    }
}