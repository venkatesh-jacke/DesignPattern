package solid.i.Example1.good;

public class Main {
    public static void main(String[] args) {

    }
}

class HumanWorker implements IType1, IType2 {

    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void work() {
        System.out.println("I can work");
    }
}

class RobotWorker implements IType2 {

    @Override
    public void work() {
        System.out.println("I can work");
    }
}

interface IType1 {
    void eat();
}

interface IType2 {
    void work();
}
