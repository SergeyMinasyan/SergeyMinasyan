package examples;

import java.util.Scanner;

public class MainScanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first, second = 20;
        System.out.println("Enter first num");
        first = scanner.nextInt();
//        if (first == second) {
//            System.out.println("Num is 20");
//        }
        switch (first) {
            case 30:
                System.out.println("Num is 30");
                break;
            case 20:
                System.out.println("Num is 20");
                break;
            default:
                System.err.println("Error");
        }

    }
}