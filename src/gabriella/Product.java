package gabriella;

public class Product {

    String Name;
    int price;

    public Product(String name, int price) {
        Name = name;
        this.price = price;
    }

    public String getName() {
        String prname= this.Name;
        return prname;

    }
}
