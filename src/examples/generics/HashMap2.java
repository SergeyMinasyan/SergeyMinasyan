package examples.generics;

import education.model.Author;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap2 {
    public static void main(String[] args) {
        Map<String, Author> authorMap = new java.util.HashMap<>();
        Author author1 = new Author("Poxos", "Poxosyan", 30, "Poxxos@mail.ru", "male");
        Author author2 = new Author("Artash", "Poxosyan", 90, "Arto@mail.ru", "male");
        authorMap.put("Poxxos@mail.ru", author1);
        authorMap.put("Arto@mail.ru", author2);
        Author poxos = authorMap.get("Poxxos@mail.ru");
        Author arto = authorMap.get("Arto@mail.ru");
        System.out.println(poxos);
//        authorMap.remove("Arto@mail.ru",arto);
        System.out.println(arto);
        Set<String> strings = authorMap.keySet();
        System.out.println("keySet -> " + strings);

        Map<String, Integer> mup = new TreeMap();
        mup.put("Armo@mail.ru", 22);
        mup.put("Ardo@mail.ru", 12);
        mup.put("Garo@mail.ru", 42);

        for (Map.Entry<String, Integer> entry : mup.entrySet()) {
            System.out.println("getValue -> " + entry.getValue());
        }

    }
}

