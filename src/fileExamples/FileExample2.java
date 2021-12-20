package fileExamples;

import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Minasyan\\Desktop");
        File file1 = new File("Документ Microsoft Word (.docx)");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.err.println(file1.isDirectory());
        System.err.println(file1.isFile());
        System.out.println(file.exists());
    }
}
