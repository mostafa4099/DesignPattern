package creational.Prototype;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:20 AM
 */
public class Square extends Shape {
    public Square(int height, int width) {
        super("Square", height, width);
    }

    public Square(Square square) {
        super(square);
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }

    @Override
    public void draw() {
        System.out.println("Drawing "+this.getType()+" with dimension: "+this.getHeight()+"*"+this.getWidth());
    }
}
