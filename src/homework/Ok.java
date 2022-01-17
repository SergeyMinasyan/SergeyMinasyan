package homework;

import Calculator.Calculator;

import java.util.Scanner;

public class Ok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cl = new Calculator();
        boolean isRun = true;
        while(isRun){
            System.err.println("Input number 1");
            int number1 = scanner.nextInt();
            System.err.println("Input number 2");
            int number2 = scanner.nextInt();
            boolean isvalid = false;
            do {
                isvalid = false;
                System.err.println("input (+,-,/,*) or 0 for exit");
                String c = scanner.next();
                switch (c) {
                    case "+":
                        System.out.println(cl.gumarum(number1, number2));
                        break;
                    case "-":
                        System.out.println(cl.hanum(number1, number2));
                        break;
                    case "*":
                        System.out.println(cl.bazmapatkum(number1, number2));
                        break;
                    case "/":
                        System.out.println(cl.bajanum(number1, number2));
                        break;
                    case "0" :
                        isRun =  false;
                        break;
                    default:
                        isvalid = true;
                        System.err.println("Error");
                }
            }while (isRun);
        }

    }
}
