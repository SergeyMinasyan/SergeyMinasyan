package fileExamples;

import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\po");
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        File NewFile = new File("C:\\Users\\Minasyan\\Desktop\\poxosik");
        file.renameTo(NewFile);


        File file2 = new File("Документ Microsoft Word (.docx)");
        System.err.println(file2.isDirectory());
        System.err.println(file2.isFile());
    }
}
