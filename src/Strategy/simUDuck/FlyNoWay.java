package Strategy.simUDuck;

public class FlyNoWay implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't Fly");
    }
}
