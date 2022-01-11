public class Fruit {
    private String name;
    private int price;

    private Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name;
    }

    public static final Fruit apple = new Fruit("apple", 10);
    public static final Fruit banana = new Fruit("banana", 20);
    public static final Fruit mango = new Fruit("mango", 30);

    public static void main(String[] args) {
        System.out.println(Fruit.apple == Fruit.mango);
    }
}

enum CustomFruit {
    mango(10),
    banana(20);

    private int price;

    CustomFruit(int price) {
        this.price = price;
    }
}
