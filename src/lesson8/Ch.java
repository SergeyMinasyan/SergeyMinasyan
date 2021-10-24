package lesson8;

public class Ch {
    public static void main(String[] args) {
        int[] sum = {2, 4, 6, 8, 5, 10};
        boolean b = true;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] % 2 != 0) {
                b = false;
                break;
            }
        }
        System.err.println(b);
    }
}