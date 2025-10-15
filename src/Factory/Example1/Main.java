package Factory.Example1;
//https://www.linkedin.com/posts/sohailashraf31_factory-method-pattern-activity-7344643939745832960-9dWH?utm_source=share&utm_medium=member_desktop&rcm=ACoAADQfhrABusil0TePI1oqifcQk611TWEQkcs

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory= new ShapeFactory();
        shapeFactory.getShape("circle").print();
        shapeFactory.getShape("square").print();
        shapeFactory.getShape("rectangle").print();

    }
}
