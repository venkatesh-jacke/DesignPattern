package Strategy.simUDuck;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyable= new FlyNoWay();
        quackable= new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model Duck");
    }
}
