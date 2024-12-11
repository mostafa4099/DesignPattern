package creational.AbstractFactory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 12/4/2024 12:43 PM
 */
public class AutoCarFactory implements CarTypeFactory {
    @Override
    public Car getCar(String brandName) {
        if(brandName.equalsIgnoreCase("audi")){
            return new AutoAudiCar();
        } else if (brandName.equalsIgnoreCase("bmw")) {
            return new AutoBmwCar();
        } else {
            throw new RuntimeException("Invalid brand name.");
        }
    }
}
