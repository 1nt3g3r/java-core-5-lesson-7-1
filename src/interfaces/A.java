package interfaces;

public interface A {
    void a();

    default void common() {
        System.out.println("Default common() method in A");
    }
}
