package NewHomework;

public class ArrayUtil {
    public static void main(String[] args) {
        //Տպեք մասիվի բոլոր էլեմենտները,
        int[] array1 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        //Տպեք մասիվի ամենամեծ թիվը
        int[] array2 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int max = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max) {
                max = array2[i];

            }
        }
        System.out.println();
        System.out.println(max);
        //Տպեք մասիվի ամենափոքրը թիվը,
        int[] array3 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int min = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < min) {
                min = array3[i];
            }
        }
        System.out.println(min);
        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        int[] array4 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 0) {
                System.out.print(array4[i] + " ");
            }
        }
        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        System.out.println();
        int[] array5 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array5.length; i++) {
            if (array5[i] % 2 != 0) {
                System.out.print(array5[i] + " ");
            }
        }
        System.out.println();
        //Տպեք կենտերի քանակը
        int[] array6 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int count = 0;
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] %2 != 0){
                count ++;
            }
        }
        System.out.println(count);
        //Տպեք զույգերի քանակը։
        int[] array7 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        int count2 = 0;
        for (int i = 0; i < array7.length; i++) {
            if (array7[i] %2 == 0){
                count2 ++;
            }
        }
        System.out.println(count2);
        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը
        int[] array8 = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        double sum = 0;
        for (int i = 0; i < array8.length; i++) {
            sum+=array8[i];
        }
        System.out.println(sum/ array8.length);

    }

}

