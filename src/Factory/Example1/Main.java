package Factory.Example1;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        shapeFactory.getShape("circle").print();
        shapeFactory.getShape("square").print();
        shapeFactory.getShape("rectangle").print();

    }
}
