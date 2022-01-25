package Exams.exeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws FileNotFoundException {
try{
    ReadFile();
}catch (FileNotFoundException e){
    System.err.println("Oh no ist ERROR");
}

    }
    public static void ReadFile() throws FileNotFoundException {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\bw");
        Scanner scanner = new Scanner(file);

    }
}
