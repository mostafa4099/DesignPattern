package creational.Prototype;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:18 AM
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Original Shape:");
        Shape shape = new Circle(2, 3);
        shape.draw();

        System.out.println("Cloned Shape:");
        Shape clonedShape = shape.clone();
        clonedShape.draw();

        System.out.println("Cloned Shape after changed:");
        clonedShape.setHeight(3);
        clonedShape.draw();

        System.out.println("Original Shape after changed:");
        shape.draw();
    }
}
