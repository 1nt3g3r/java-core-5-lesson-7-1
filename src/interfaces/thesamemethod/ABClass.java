package interfaces.thesamemethod;

public class ABClass implements A, B {
    @Override
    public void a() {
        A.super.a();
    }

    @Override
    public void common() {
        System.out.println("ABClass implementation");
    }

    public static void main(String[] args) {
        ABClass abClass = new ABClass();

        useA(abClass);
        useB(abClass);
    }

    public static void useA(A a) {
        a.common();
    }

    public static void useB(B b) {
        b.common();
    }

}
