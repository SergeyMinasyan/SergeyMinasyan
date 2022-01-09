package examples.try_catch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 10 :
                System.err.println("good");
                break;
            case 20:
                System.err.println("nice");
                break;
            case 30:
                System.err.println("beautiful");
                break;
            default:
                System.err.println("error");
        }
    }
}
