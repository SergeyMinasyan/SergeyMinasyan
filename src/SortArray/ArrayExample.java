package SortArray;

import sun.font.FontRunIterator;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {7, 5, 4, 2, 2, 8, 2, 6, 5};
        //Գտնել մասիվի կրկնվող էլեմենտներ
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "- ը կրկնվում է");
                    break;
                }
            }
        }
    }
}
