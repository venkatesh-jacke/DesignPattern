package Factory.Example1;

public class ShapeFactory {
    public Shape getShape(String shape) {
        return switch (shape) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            case "rectangle" -> new Rectangle();
            case "cylinder" -> new Cylinder();
            default -> new Circle();
        };

    }
}
