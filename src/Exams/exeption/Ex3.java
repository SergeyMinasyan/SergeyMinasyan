package Exams.exeption;

import java.io.IOException;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args)  {
        Scanner scanner= new Scanner(System.in);
        System.out.println("0-10");
        while (true){
            int x = Integer.parseInt(scanner.nextLine());
            if (x > 10){
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.err.println("Idiot");
                }

            }
        }
    }
}
