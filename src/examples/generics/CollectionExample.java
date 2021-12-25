package examples.generics;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();// shat elementneri depqum LinkedList
        names.add("Poxos");
        names.add("Petros");
        names.add("Martiros");
//        for (String name : names) {
//            System.err.println("Name is: "+ name);
//        }
        for (int i = 0; i < 20; i++) {
            names.add("name " + i);
      }


//        for (String name : names) {
//            System.out.println(name);
//        }


//        String s = names.get(10);
//        System.out.println(s);

    }


}
