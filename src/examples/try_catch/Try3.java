package examples.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input number");
        try {
            double num = scanner.nextDouble();
            System.out.println(num);
        }catch (Exception ex){
            System.err.println("Invalid input");
        }
    }
}
