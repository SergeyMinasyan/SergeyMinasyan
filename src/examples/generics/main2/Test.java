package examples.generics.main2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        List animals = new ArrayList<>();
//        animals.add("cat");
//        animals.add("dog");
//        animals.add("frog");

//String animal = (String) animals.get(1);
//        System.out.println(animal);

        List<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        System.out.println(animals.get(1));


    }


}