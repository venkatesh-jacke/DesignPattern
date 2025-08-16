package Singleton.Example3;

public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
        //Prevent instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Use getInstance() to get the singleTon");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


    //Preventing cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Singletons cannot be cloned");
    }

    //Prevent serialize/de-serialize attacks
    public Object readResolve() {
        return getInstance();
    }
}
