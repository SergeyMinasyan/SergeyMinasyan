package arrayutil;

public class ArrayUtil3 {
    public static void main(String[] args) {
        //ՏՊԵԼ ԿԵՆՏԵՐԻ ՔԱՆԱԿԸ
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                count++;
            }
        }
        System.out.println("Count = " + count);

    }
}