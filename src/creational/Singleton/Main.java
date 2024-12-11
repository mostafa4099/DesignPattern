package creational.Singleton;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:04 AM
 */
public class Main {
    public static void main(String[] args) {
        NonSingleton nonSingleton1 = new NonSingleton();
        NonSingleton nonSingleton2 = new NonSingleton();

        System.out.println("Hashcode of instance1 is " + nonSingleton1.hashCode());
        System.out.println("Hashcode of instance2 is " + nonSingleton2.hashCode());

        if (nonSingleton1 == nonSingleton2) {
            System.out.println("Both objects point to the same memory location on the heap.");
        } else {
            System.out.println("Both objects don't  point to the same memory location on the heap.");
        }

        EarlyInitialization earlyInstance1 = EarlyInitialization.getInstance();
        EarlyInitialization earlyInstance2 = EarlyInitialization.getInstance();

        System.out.println("Hashcode of earlyInstance1 is " + earlyInstance1.hashCode());
        System.out.println("Hashcode of earlyInstance2 is " + earlyInstance2.hashCode());

        if (earlyInstance1 == earlyInstance2) {
            System.out.println("Both early instances point to the same memory location on the heap.");
        } else {
            System.out.println("Both early instances don't  point to the same memory location on the heap.");
        }

        LazyInitialization lazyInstance1 = LazyInitialization.getInstance();
        LazyInitialization lazyInstance2 = LazyInitialization.getInstance();

        System.out.println("Hashcode of lazyInstance1 is " + lazyInstance1.hashCode());
        System.out.println("Hashcode of lazyInstance2 is " + lazyInstance2.hashCode());

        if (lazyInstance1 == lazyInstance2) {
            System.out.println("Both lazy instances point to the same memory location on the heap.");
        } else {
            System.out.println("Both lazy instances don't  point to the same memory location on the heap.");
        }
    }
}
