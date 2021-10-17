package arrayutil;

import java.sql.SQLOutput;

public class Arrayutilll {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 6, 8, 9, 10, 14, 15};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("Զույգ էլեմենտները");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);
            }
        }
        System.out.println();
        System.out.println("Տպել բոլոր էլեմենտները");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min :" + min);
        System.out.println("Տպել բոլոր կենտ էլեմենտնրը");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
                System.out.println();
            }
        }
        System.out.println("Տպել բոլոր զուըգ էլեմենտների քանակը");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        System.out.println("count = " + count);
        System.out.println("Տպել բոլոր կենտ էլեմենտների քանակը");
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println("count = " + count2);
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum : " + sum);
        System.out.println("avg : " + sum / array.length);
    }
}






