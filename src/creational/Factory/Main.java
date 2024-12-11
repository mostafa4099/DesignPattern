package creational.Factory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:18 AM
 */
public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("square");
        shape.draw();
    }
}
