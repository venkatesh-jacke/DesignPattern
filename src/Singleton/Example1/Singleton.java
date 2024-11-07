package Singleton.Example1;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            instance = new Singleton();
        }
        return instance;
    }

    public Object readResolve() {
        return getInstance();
    }
}
