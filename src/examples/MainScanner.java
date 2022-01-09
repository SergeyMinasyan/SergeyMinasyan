package examples;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your string is " + scanner.nextLine());
        int first, second, result;
        System.out.println("Enter first num");
        first = scanner.nextInt();
        System.out.println("Enter second num");
        second = scanner.nextInt();
        result = first + second;
        System.out.println("Result is " + result);
    }
}
