package solid.o.Example1.bad;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2, 4);
        Square square = new Square(3);
    }

}

class Square {
    int side;

    public Square(int side) {
        this.side = side;
    }
}

class Rectangle {
    int height;
    int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }
}

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
}


class Area {
    Double calculateArea(Circle circle) {
        return (3.14 * circle.radius * circle.radius);
    }

    int calculateArea(Rectangle rectangle) {
        return rectangle.height * rectangle.width;

    }

    int calculateArea(Square square) {
        return square.side * square.side;
    }
}