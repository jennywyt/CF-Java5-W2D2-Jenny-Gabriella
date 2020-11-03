package jenny;

import java.util.*;

public class classwork {
    public static void main(String[] args) {

        ArrayList<String> fruitMix = new ArrayList<String>();

        fruitMix.add("Apple");
        fruitMix.add("Pear");
        fruitMix.add("Banana");
        fruitMix.add("Durian");
        fruitMix.add("Peach");
        fruitMix.add("Blueberry");


        ArrayList<String> vegetables = new ArrayList<String>();

        vegetables.add("Cabbage");
        vegetables.add("Onion");
        vegetables.add("Egg Plant");
        vegetables.add("Cucumber");
        vegetables.add("Paprika");
        vegetables.add("Pumpkin");

        vegetables.addAll(fruitMix);

        //unsorted list


        //Sort statement
        Collections.sort(vegetables);
        System.out.println(vegetables);


    }
}
