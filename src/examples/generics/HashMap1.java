package examples.generics;

import education.model.Author;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 {
    public static void main(String[] args) {
//        Map<String , Author> authorMap =new HashMap<>();
//        authorMap.put("Poxos@mail.ru",new Author("Poxos","Poxosyan",20,"Poxos@mail.ru","male"));
//        System.out.println(authorMap.get("Poxos@mail.ru"));
//        System.out.println(authorMap.keySet());
        Map<String, Integer> integerMap = new TreeMap<>();
        integerMap.put("Poxos", 12);
        integerMap.put("Aram", 33);
        integerMap.put("Bko", 22);
        System.out.println(integerMap.size());
        System.out.println(integerMap.hashCode());
        System.out.println(integerMap.entrySet());
        System.out.println(integerMap.isEmpty());
        System.out.println(integerMap.keySet());
        for (Map.Entry<String, Integer> stringIntegerEntry : integerMap.entrySet()) {
            System.out.println(stringIntegerEntry.getValue());
        }
        integerMap.replace("Poxos",14);
        System.out.println(integerMap);
    }
}
