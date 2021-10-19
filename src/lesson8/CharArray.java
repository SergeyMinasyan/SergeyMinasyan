package lesson8;

public class CharArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 7, 9, 10};
        int x = 6;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = -1;
            }
        }
        System.out.println(index);
    }
}
