package Strategy.simUDuck;

public class MuteQuack implements Quackable {
    @Override
    public void quack() {
        System.out.println("-----Silence-----");
    }
}
