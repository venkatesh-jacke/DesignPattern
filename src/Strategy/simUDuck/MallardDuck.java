package Strategy.simUDuck;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackable= new Quack();
        flyable= new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
