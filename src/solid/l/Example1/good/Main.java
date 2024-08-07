package solid.l.Example1.good;

// Liskov Substitution Principle
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Lion lion = new Lion();

        animal.sleep();
        animal.eat();

        human.sleep();
        human.eat();
        human.sing();
        human.dance();

        lion.sleep();
        lion.eat();
        lion.kill();
    }
}

class Animal {
    void sleep() {
        System.out.println("Animal can sleep");
    }
    void eat() {
        System.out.println("Animal can eat");
    }
}

interface ICarnivores {
    void kill();
}

class Lion extends Animal implements ICarnivores {
    @Override
    public void kill() {
        System.out.println("Lion can kill");
    }

    @Override
    void sleep() {
        System.out.println("Lion can sleep");
    }

    @Override
    void eat() {
        System.out.println("Lion can eat");
    }
}

interface IEntertainer {
    void sing();
    void dance();
}

class Human extends Animal implements IEntertainer {
    @Override
    void sleep() {
        System.out.println("Human can sleep");
    }

    @Override
    void eat() {
        System.out.println("Human can eat");
    }

    @Override
    public void sing() {
        System.out.println("Human can sing");
    }

    @Override
    public void dance() {
        System.out.println("Human can dance");
    }
}
