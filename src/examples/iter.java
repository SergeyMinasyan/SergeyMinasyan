package examples;

import java.util.ArrayList;

public class iter {
    public static void main(String[] args) {
     //   String[]animals = {"cat","dog","rat","bird"};
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("cat");

        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
