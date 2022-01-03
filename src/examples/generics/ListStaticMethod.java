package examples.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStaticMethod {
    public static void main(String[] args) {
        ArrayList<Integer>integer = new ArrayList<>();
        integer.add(10);
        integer.add(20);
        integer.add(30);

        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Poxos");
        arrayList.add("Martiros");
        System.out.println(arrayList.get(0));

        List<String> list = new LinkedList<>();
        list.add("Papo");
        list.add("Peto");
        list.add("Pado");

        print(list);
        print(integer);
        print(arrayList);
    }

    static void print(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }

    }
}
