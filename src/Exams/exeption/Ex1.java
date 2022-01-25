package Exams.exeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\bw");
        try {
            Scanner scanner = new Scanner(file);


        } catch (FileNotFoundException e) {
            System.err.println("Error!!! File not found");
            e.getMessage();
        }
        System.out.println("After try catch");
    }
}