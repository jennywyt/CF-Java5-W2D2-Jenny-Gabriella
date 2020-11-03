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
        //WishList.add(p4);
        //WishList.add(p5);
        //WishList.add(p6);
        System.out.println("the wish list is: \n"+WishList);
        System.out.println(WishList.get(0).name);


        System.out.println("********************************************");
        int wpreis = 0;
        for (Product element : WishList) {
            wpreis+= element.price;
            System.out.println(element.name+"   "+element.price);
        }


        System.out.println("****************my Way************************");

        Iterator itr= WishList.iterator();
        System.out.println(itr);
        int sumPreis=0;

        for(int i=0; i< WishList.size();i++){
            sumPreis+= WishList.get(i).price;

        }
        //int sumPreis=0;
        while(itr.hasNext()) {
            Product pr =(Product) itr.next();
            System.out.print("What is that pr?     ");
            System.out.println(pr);

            System.out.println(pr.name + "   " + pr.price);
            System.out.println();
            //sumPreis+=pr.price;
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("You have to pay for all of this stuff: "+sumPreis);


    }
}

 /*   String objName;
        for (int i=0; i<WishList.size(); i++){
        objName = W
        System.out.println();
        // System.out.println(WishList(i).getName());
        }
*/
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