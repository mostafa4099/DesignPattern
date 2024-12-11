package creational.AbstractFactory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 12/4/2024 12:55 PM
 */
public class Main {
    public static void main(String[] args) {
        CarTypeFactory carTypeFactory = CarFactory.getCarTypeFactory("auto");
        Car car = carTypeFactory.getCar("audi");
        System.out.println("Your "+car.getCarName()+" is ready to deliver.");
    }
}
