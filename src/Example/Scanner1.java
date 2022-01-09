package Example;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first , second , result;
        System.out.println("first");
        first = scanner.nextInt();
        System.out.println("second");
        second = scanner.nextInt();
        System.out.println("result");
        result = first +second;
        System.out.println("result is " + result);

    }
}
