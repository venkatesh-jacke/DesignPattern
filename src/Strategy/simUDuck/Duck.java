package Strategy.simUDuck;

public abstract class Duck {

    Flyable flyable;
    Quackable quackable;

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Quackable getQuackable() {
        return quackable;
    }

    public void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }

    public void swim(){
        System.out.println("All ducks can swim");
    }

    public abstract void display();

}
