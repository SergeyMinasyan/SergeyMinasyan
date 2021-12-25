package examples.generics;

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        String[] fruit = new String[2];
        try {
            fruit[0] = "Mango";
            fruit[1] = "Apple";
            fruit[2] = "Strawberry";
            fruit[3] = "Lymon";
        }catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("String[] fruit = new String[2] -> ArrayIndexOutOfBoundsException");
        }

        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.remove("Strawberry");
        System.out.println(fruitList.contains("Apple"));
        System.out.println(fruitList.contains("Raspberry"));
//        fruitList.clear();
        System.out.println(fruitList);


    }
}
