package lesson11;

import java.util.Scanner;

public class Boo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Please input first number ");
        int a = scanner.nextInt();
        System.err.println("Please input second number ");
        int b = scanner.nextInt();
        Calculator calculator = new Calculator();
        boolean isValidOperation = false;
        do {
            System.err.println("Please input (+,-,*,/)");
            String c = scanner.next();
            switch (c) {
                case "+":
                    System.out.println(calculator.gumarum(a, b));
                    isValidOperation = true;
                    break;
                case "-":
                    System.out.println(calculator.hanum(a, b));
                    isValidOperation = true;
                    break;
                case "*":
                    System.out.println(calculator.bazmapatkum(a, b));
                    isValidOperation = true;

                    break;
                case "/":
                    System.out.println(calculator.bajanum(a, b));
                    isValidOperation = true;
                    break;
                default:
                    System.err.println("Error");
            }
        }
        while (!isValidOperation);
        }


        }


