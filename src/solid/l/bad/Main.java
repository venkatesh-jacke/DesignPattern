package solid.l.bad;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Lion lion = new Lion();

        animal.dance();
        animal.eat();
        animal.sleep();
        animal.sing();
        animal.kill();

        human.dance();
        human.eat();
        human.sleep();
        human.sing();
        human.kill(); // this will crash

        lion.dance(); // this will crash
        lion.eat();
        lion.sleep();
        lion.sing(); // this will crash
        lion.kill();


    }
}


class Animal {
    void eat() {
        System.out.println("Animal can eat");
    }

    void sleep() {
        System.out.println("Animal can sleep");
    }

    void sing() {
        System.out.println("Animal can sing");
    }

    void dance() {
        System.out.println("Animal can dance");
    }

    void kill() {
        System.out.println("Animal can kill");
    }
}

class Human extends Animal {
    @Override
    void eat() {
        System.out.println("Human can eat");
    }

    @Override
    void sleep() {
        System.out.println("Human can sleep");
    }

    @Override
    void sing() {
        System.out.println("Human can eat");
    }

    @Override
    void dance() {
        System.out.println("Human can dance");
    }

    @Override
    void kill() {
        new UnsupportedOperationException("Human should not kill");
    }
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("lion can eat");
    }

    @Override
    void sleep() {
        System.out.println("lion can sleep");
    }

    @Override
    void sing() {
        throw new UnsupportedOperationException("lion can't Sing");
    }

    @Override
    void dance() {
        throw new UnsupportedOperationException("lion can't dance");
    }

    @Override
    void kill() {
        System.out.println("lion can kill");
    }
}