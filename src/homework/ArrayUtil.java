package homework;

public class ArrayUtil {
    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.err.println("Max : " + max);
    }

    void print(int[] array) {
        for (int z : array) {
            System.out.print(z + " ");
        }
    }

    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.err.println("Min :" + min);
    }

    void ZuygelEmentner(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void KentElementner(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    void ZuygeriQanaky(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }

        }
        System.err.println("count = " + count);
    }
    void KenteriQanaky(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }
        System.err.println("count = " + count);
    }
    void ElementneriGumary(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum : " + sum);
    }
    void MijinTvabanakan(int[] array){
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("avg : " + sum / array.length);
    }
}




