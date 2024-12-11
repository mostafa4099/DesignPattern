package creational.AbstractFactory;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 12/4/2024 12:52 PM
 */
public class CarFactory {
    public static CarTypeFactory getCarTypeFactory(String type){
        if(type.equalsIgnoreCase("auto")){
            return new AutoCarFactory();
        } else if (type.equalsIgnoreCase("manual")) {
            return new ManualCarFactory();
        } else {
            throw new RuntimeException("Invalid Loan Type");
        }
    }
}
