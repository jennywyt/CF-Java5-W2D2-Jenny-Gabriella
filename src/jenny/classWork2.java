package jenny;

import java.util.*;
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}

public class classWork2 {

    public static void main(String[] args) {
        Product newProduct1 = new Product("Kitchen Aid", 400);
        Product newProduct2 = new Product("Rice Cooker", 100);
        Product newProduct3 = new Product("Coffee Machine", 60);

        ArrayList<Product> products = new ArrayList<>();
        products.add(newProduct1);
        products.add(newProduct2);
        products.add(newProduct3);


        double sum = 0;
        for (int i = 0; i < products.size(); i++) {
            Product currentElement = products.get(i);
            sum += currentElement.price;
        }

        System.out.println(sum);

    }
}