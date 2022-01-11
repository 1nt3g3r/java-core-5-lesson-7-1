package interfaces;

public class SuperClass implements B {
    @Override
    public void a() {

    }

    @Override
    public void b() {
        System.out.println("My own b() method implementation");
    }

    public static void main(String[] args) {
        new SuperClass().common();
    }
}
