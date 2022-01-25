package Exams;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("Babken");
        strings.add("Aram");
        strings.add("Karen");
        strings.add("Armen");
        for (String string : strings) {
            System.out.println(string);
        }

    }
}

