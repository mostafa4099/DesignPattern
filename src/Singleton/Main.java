package Singleton;

/**
 * @Author Md. Golam Mostafa | mostafa.sna@gmail.com
 * @CreationDate 10/17/2024 11:04 AM
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Hashcode of instance1 is " + singleton1.hashCode());
        System.out.println("Hashcode of instance2 is " + singleton2.hashCode());

        if (singleton1 == singleton2) {
            System.out.println("Both objects point to the same memory location on the heap.");
        } else {
            System.out.println("Both objects don't  point to the same memory location on the heap.");
        }

        NonSingleton nonSingleton1 = new NonSingleton();
        NonSingleton nonSingleton2 = new NonSingleton();

        System.out.println("Hashcode of instance1 is " + nonSingleton1.hashCode());
        System.out.println("Hashcode of instance2 is " + nonSingleton2.hashCode());

        if (nonSingleton1 == nonSingleton2) {
            System.out.println("Both objects point to the same memory location on the heap.");
        } else {
            System.out.println("Both objects don't  point to the same memory location on the heap.");
        }
    }
}
