package gabriella;

public class Product {
    String name;
    Double price;


    public Product(String name, double price) {

        this.name = name;
        this.price = price;
    }

    public String getPrdata(){
        String prData=this.name+"    "+String.valueOf(this.price);
        return prData;
    }


    public String getName() {
      return this.name;
    }



 @Override
    public String toString() {
        return "Product name: " + this.name +", price=" + this.price;
    }

}
