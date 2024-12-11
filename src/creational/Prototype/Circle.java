package creational.Prototype;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:19 AM
 */
public class Circle extends Shape {
    public Circle(int height, int width) {
        super("Circle", height, width);
    }

    public Circle(Circle circle) {
        super(circle);
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+this.getType()+" with dimension: "+this.getHeight()+"*"+this.getWidth());
    }
}
