package examples.generics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();//TreeSet -> tareri hajordaknutyun, LinkedHastSet -> kpahec henc avelcraci pes
        names.add("poxos");
        names.add("arshak");
        names.add("davo");
        names.add("petros");
        names.add("martiros");
        names.add("aram");
//        names.add("poxos");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
