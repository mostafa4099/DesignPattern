package creational.Singleton;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:01 AM
 */
public class EarlyInitialization {
    private static final EarlyInitialization instance = new EarlyInitialization();

    private EarlyInitialization() {
    }

    public static EarlyInitialization getInstance() {
        return instance;
    }
}
