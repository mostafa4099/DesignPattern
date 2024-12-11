package creational.Prototype;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:18 AM
 */
public abstract class Shape {
    private String type;
    private int height;
    private int width;

    public Shape(String type, int height, int width) {
        this.type = type;
        this.height = height;
        this.width = width;
    }

    public Shape(Shape shape) {
        this.type = shape.type;
        this.height = shape.height;
        this.width = shape.width;
    }

    public String getType() {
        return type;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract Shape clone();

    abstract void draw();
}
