package examples.enum1;

import java.util.Scanner;

public class LangTest {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Lang lang = Lang.RU;
//        System.out.println(Lang.ARM);
        Lang[] values = Lang.values();
        System.err.println("Please choose language");
        for (Lang value : values) {
            System.out.print(value + " ");
        }
        String lang = scanner.nextLine();

        try {
            Lang userLang = Lang.valueOf(lang.toUpperCase());
            System.out.println(userLang);
            System.out.println("Country name is " + userLang.getCountryName());
            System.out.println("Count is " + userLang.getCount());
            System.out.println("Ordinal is " + userLang.ordinal());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

    }
}