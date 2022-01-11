package interfaces.thesamemethod;

public interface B {
    default void common() {
        System.out.println("In B");
    }
}
