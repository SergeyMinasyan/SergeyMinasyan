package arrayutil;

public class ArrayUtil1 {
    // ՏՊԵԼ ՄԱՍԻՎԻ ԲՈԼՈՐ ԷԼԵՄԵՆՏՆԵՐԻ ՄԻՋԻՆ ԹՎԱԲԱՆԱԿԱՆԸ
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 99};
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        System.out.println(result / array.length);

    }
}
