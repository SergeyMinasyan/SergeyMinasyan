package Static;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String name = "Poxos";
        name = name + "ik";
        System.out.println(name);
        String name2 = " Poxos Poxosyan   ";
        String trim = name2.trim();
        System.out.println(trim);
        System.out.println(name.trim());
        System.out.println(name2.toLowerCase());
        System.out.println(name2.toUpperCase());
    }
}