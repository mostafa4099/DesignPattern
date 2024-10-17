package Factory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:23 AM
 */
public class ShapeFactory {
    public static Shape getShape(String shapeType) {
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
