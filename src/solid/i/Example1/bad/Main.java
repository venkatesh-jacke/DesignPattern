package solid.i.Example1.bad;

public class Main {
    public static void main(String[] args) {

    }


}

class HumanWorker implements IWoreker {
    @Override
    public void eat() {
        System.out.println("I am eating");
    }

    @Override
    public void work() {
        System.out.println("I am working");
    }
}

class RobotWorker implements IWoreker {
    @Override
    public void eat() {
        throw new UnsupportedOperationException("I can't eat");
    }

    @Override
    public void work() {
        System.out.println("I am working");
    }
}

interface IWoreker {
    void eat();

    void work();
}
