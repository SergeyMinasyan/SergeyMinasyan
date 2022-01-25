package Exams;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {
        Set<String> strings = new TreeSet<>();
        strings.add("Babken");
        strings.add("Aram");
        strings.add("Karen");
        strings.add("Armen");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
