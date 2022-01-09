package Example;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        int[]a ;
         int z ;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
                z= in.nextInt();
                a= new int[z];
        for (int i = 0; i < z; i++) {
            System.out.println("Enter a[" + i + "] = ");
      a[i] = in.nextInt();
        }
    }
}
