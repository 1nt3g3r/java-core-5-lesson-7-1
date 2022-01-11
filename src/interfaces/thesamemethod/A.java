package interfaces.thesamemethod;

public interface A {
    default void a() {
        System.out.println("In a() method");
    }

    default void common() {
        System.out.println("In A");
    }
}
