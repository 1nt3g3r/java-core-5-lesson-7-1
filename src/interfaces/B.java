package interfaces;

public interface B extends A {
    default void b() {
        System.out.println("Default b implementation");
    }

    @Override
    default void common() {
        System.out.println("Default common() method implementation in B");
    }
}
