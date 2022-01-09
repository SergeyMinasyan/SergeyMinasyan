package examples.ye;

import examples.enum1.Lang;

import java.util.Locale;
import java.util.Scanner;

public class Test {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        Language language = Language.RU;
//        System.out.println(Language.ENG);
//        Language[] values = language.values();
//        for (Language value : values) {
//            System.out.println(value);
            Language[] values = Language.values();
            System.err.println("Please choose language");
            for (Language value : values) {
                System.out.println(value);

            }
        String lang = scanner.nextLine();
            try {
                Language userLang = Language.valueOf(lang.toUpperCase());
                System.out.println(userLang);
                System.out.println(userLang.getTranslation() + " " + userLang.getCount());
            }catch (IllegalArgumentException ex){
                System.err.println(ex.getMessage());
            }

    }
    }



