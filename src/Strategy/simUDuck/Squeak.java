package Strategy.simUDuck;

public class Squeak implements Quackable{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
