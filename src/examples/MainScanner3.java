package examples;
import java.util.Scanner;
public class MainScanner3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int value;
        do {
            System.err.println("Введи 10");
             value = scanner.nextInt();

        }while (value!=10);
        System.err.println("Вы ввели 10");
    }


}
