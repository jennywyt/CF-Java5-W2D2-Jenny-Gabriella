package gabriella;
import java.util.*;

public class ProductMain {
    public static void main(String[] args) {

        Product p1= new Product("Computer",800);
        Product p2= new Product("Sauna",900);
        Product p3= new Product("Bycicle",990);
        Product p4= new Product("Chair",790);
        Product p5= new Product ("Blender",120);
        Product p6= new Product ("Juice extractor", 670);

        ArrayList <Product> WishList = new ArrayList<Product>();

        WishList.add(p1);
        WishList.add(p2);
        WishList.add(p3);
        WishList.add(p4);
        WishList.add(p5);
        WishList.add(p6);

        System.out.println("****************from Jenny************************");
        for (Product element : WishList) {
            System.out.println(element);
        }




    }
}


/*Iterator itr=WishList.iterator();
        System.out.println(itr);

        while(itr.hasNext()) {
            Product pr = (Product) itr.next();
            System.out.println(pr.Name + "   " + pr.price);
        }
*/

          //  System.out.println("****************************************");
        /*System.out.println(WishList);
        for (int i=0; i<WishList.size(); i++){
            System.out.println( "Element"+i+"  "+ WishList.get(i));
           // System.out.println(WishList(i).getName());
        }
        */