package Strategy.simUDuck;

public class FlyRocketPowered implements Flyable{
    @Override
    public void fly() {
        System.out.println("I'm Flying with Rocket");
    }
}
