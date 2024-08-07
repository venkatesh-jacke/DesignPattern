package solid.o.Example1.good;


public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(3);
    }
}

class Circle implements IShape {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * this.radius * this.radius;
    }
}

class Rectangle implements IShape {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.height * this.width;
    }
}

class Square implements IShape {
    int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}

interface IShape {
    double calculateArea();
}