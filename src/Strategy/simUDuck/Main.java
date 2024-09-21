package Strategy.simUDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard= new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        ModelDuck modelDuck= new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyable(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
