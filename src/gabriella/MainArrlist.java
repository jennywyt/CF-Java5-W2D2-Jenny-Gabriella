package gabriella;

import java.util.ArrayList;



public class MainArrlist {

    public static void main(String[] args) {

       // ArrayList <String> FruitMix = new ArrayList<String>("Ban","Kir");

        ArrayList <String> FruitMix = new ArrayList<String>();
        FruitMix.add("Banana");
        FruitMix.add("Cherry");
        FruitMix.add("Rockmelon");
        FruitMix.add("Strawberry");
        FruitMix.add("Blueberry");
        FruitMix.add("Raspberry");

        ArrayList <String> Vegetables = new ArrayList<String>();

        Vegetables.add("Carrots");
        Vegetables.add("Zucchini");
        Vegetables.add("Tomato");
        Vegetables.add("Lettuce");
        Vegetables.add("Celery");


        System.out.println(FruitMix);
        System.out.println(Vegetables);

        FruitMix.addAll(Vegetables);
        System.out.println("**********************ArrayList after joining vegetables to fruits*****************");
        System.out.println(FruitMix);
        System.out.println(Vegetables);






    }
}
