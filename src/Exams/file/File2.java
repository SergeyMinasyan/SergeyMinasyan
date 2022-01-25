package Exams.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File2 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\Minasyan\\Desktop\\grataxtak_.txt";
        File file = new File(path);

        Scanner scanner = new Scanner(file);
while (scanner.hasNext()){
    System.out.println(scanner.nextLine());
}
scanner.close();
    }
}
