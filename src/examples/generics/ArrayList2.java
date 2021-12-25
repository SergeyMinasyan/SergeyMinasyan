package examples.generics;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");
//        System.out.println(bakeryList);
//        System.out.println(bakeryList.get(0));

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("tomatoes");
        produceList.add("zucchini");
        produceList.add("peppers");


        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("soda");
        drinkList.add("coffee");
        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinkList);
        System.out.println(groceryList.get(0));
        System.out.println(groceryList.get(0).get(1));
//        System.out.println(drinkList);
    }
}
