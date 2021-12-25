package examples.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Bob");
        name.add("John");
        name.add("Karl");
        for (int i = 0; i < 10; i++) {
            name.add("Name: " + i);

        }
        print(name);
    }

    static void print(List<String> list ){
        for (String s : list) {
            System.out.println(s);
        }
    }
}

