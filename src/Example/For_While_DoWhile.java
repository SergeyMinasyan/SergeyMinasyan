package Example;

public class For_While_DoWhile {
    public static void main(String[] args) {
        for (int i = 20; i >= 0; i -= 2) {
            System.out.print(i + " ");

        }
        System.out.println();
        boolean isTrue = true;
        int j = 0;
        while (isTrue) {
            System.out.println(j);
            j += 2;
            if (j > 10) ;
            isTrue = false;
        }
        int x = 0;
        do {
            System.out.println(x);
        } while (x < 0);
        System.out.println();

        //int z = 0;
        //while (z < 100) {
        //    z += 1;
        //    if (z % 2 == 0) {
        //        continue;
        //        System.out.println(z);
            }
        }


