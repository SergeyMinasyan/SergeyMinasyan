package examples.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try5 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a");
            int a = scanner.nextInt();
            System.out.println("input b");
            int b = scanner.nextInt();
            int z = a / b;
            System.out.println(z);
        }catch (ArithmeticException ex){
            System.out.println("You can't divide by zero!!!");
        }
        catch (InputMismatchException exe){
            System.out.println("Please enter a number!!!");
        }
    }
}