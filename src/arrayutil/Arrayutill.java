package arrayutil;

public class Arrayutill {
    public static void main(String[] args) {
        //ՏՊԵԼ ՄԱՍԻՎԻ ԲՈԼՈՐ ԿԵՆՏ ԹՎԵՐԸ
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println(array[i]);
            }
        }
    }
}