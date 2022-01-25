package examples.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList(20);
        arrayList.add("Poxos");
        arrayList.add("Pedros");
        arrayList.add(0,"Martiros");
        arrayList.add("Hayk");
        arrayList.set(2,"Pado");
        System.out.println(arrayList);
        Iterator<String> iterator = arrayList.iterator();
       while (iterator.hasNext()){
           iterator.next();
           iterator.remove();
       }
        System.out.println(arrayList);
    }
}