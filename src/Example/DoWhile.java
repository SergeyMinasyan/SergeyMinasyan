package Example;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int value;
        do{
            System.out.println("input 5");
             value = sc.nextInt();
        }while (value!=5 );
            System.out.println("Good");
        }
    }

