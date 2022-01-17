package SortArray;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 3, 1, 6, 93, 44, 22, 11};
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] > array[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        int[] array2 = {2, 5, 8, 3, 1, 6, 93, 44, 22, 11};
        for (int i = 0; i < array2.length; i++) {
            for (int j = 1; j < array2.length; j++) {
                if (array2[j] < array2[j-1]){
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
            }
        }
        for (int i = 0; i < array2.length ; i++) {
            System.err.print(array2[i] + " ");
        }
        //եթե մասիվի բոլոր էլ զուըգ են տպել true else false;
   int[] array1 = {7,5,4,5,8,2,6,5};
        boolean isEven= true;
        for (int i = 0; i < array1.length; i++) {
            if (array[i] %2 != 0) {
                isEven = false;
                break;
            }
        }
        System.out.println(isEven);
    }
}
