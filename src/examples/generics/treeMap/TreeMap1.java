package examples.generics.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,Student>studentTreeMap = new TreeMap();
        Student student1  = new Student("Poxos","Poxosyan","20");
        Student student2  = new Student("Karen","Poxosyan","100");
        Student student3  = new Student("Aram","Poxosyan","90");
        Student student4  = new Student("Karen","Poxosyan","90");
        studentTreeMap.put(10, student1);
        studentTreeMap.put(30, student2);
        studentTreeMap.put(20, student3);
//        System.out.println(studentTreeMap.get(10));
//        System.out.println(studentTreeMap);
//        System.err.println(studentTreeMap.descendingMap());     // mecic poqr yst keyeri
//        System.out.println(studentTreeMap.tailMap( 20)); // key ic bardzrnery ktpe
//        System.out.println(studentTreeMap.headMap(20));   //keyic poqrnery
//        System.out.println("lastEntry" + studentTreeMap.lastEntry());
//        System.out.println("firstEntry" + studentTreeMap.firstEntry());
        System.out.println(studentTreeMap);
    }
}
