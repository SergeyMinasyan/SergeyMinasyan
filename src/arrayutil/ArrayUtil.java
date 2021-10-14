package arrayutil;

import javax.xml.bind.SchemaOutputResolver;

public class ArrayUtil {
    public static void main(String[] args) {
        // Տպել մասիվի բոլոր էլեմենտները
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // ՏՊԵԼ ՄԱՍԻՎԻ ԱՄԵՆԱՄԵԾ ԹԻՎԸ
        System.out.println();
        System.out.println(array[9]);
        System.out.println();

        //ՏՊԵԼ ՄԱՍԻՎԻ ԱՄԵՆԱՓՈՔՐ ԹԻՎԸ
        System.out.println(array[0]);
        System.out.println();
    }
}
