package collection.stream;

public class Product {
    int id;
    String name;

    public float getPrice() {
        return price;
    }

    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
