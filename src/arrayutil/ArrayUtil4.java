package arrayutil;

public class ArrayUtil4 {
    public static void main(String[] args) {
        //ՏՊԵԼ ՄԱՍԻՎԻ ԲՈԼՈՐ ԶՈՒՅԳ ԷԼԵՄԵՆՏՆԵՐԸ
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }

        }
    }
}

