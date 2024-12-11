package creational.AbstractFactory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 12/4/2024 12:43 PM
 */
public class ManualCarFactory implements CarTypeFactory {
    @Override
    public Car getCar(String brandName) {
        if(brandName.equalsIgnoreCase("audi")){
            return new ManualAudiCar();
        } else if (brandName.equalsIgnoreCase("bmw")) {
            return new ManualBmwCar();
        } else {
            throw new RuntimeException("Invalid brand name.");
        }
    }
}
