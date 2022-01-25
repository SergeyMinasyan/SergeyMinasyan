package Exams.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class File1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\exam.txt");
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] lines = line.split(" ");
        System.out.println(Arrays.toString(lines));
        scanner.close();
    }
}
