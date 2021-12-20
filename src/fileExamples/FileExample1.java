package fileExamples;

import java.io.File;

public class FileExample1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Minasyan\\Desktop\\example1.txt");
        System.out.println("file isFile: " + file.isFile());
        System.out.println("file1 isDirectory: " + file.isDirectory());
        System.out.println("file Exists: " + file.exists());
        System.out.println();


        File file2 = new File("C:\\Users\\Minasyan\\Desktop\\java");
        File[] files = file2.listFiles();
        for (File file3 : files) {
            System.out.print("file2ListFiles & file3length: " + file3 + " " + file3.length());
      if (file2.isFile()){
          System.out.println(" " + "is file");
      }else {
          System.out.println(" " + "is directory");
      }
        }
        System.out.println("file2List: "+ file2.list());
        System.out.println("file2GetName  & file2length: " + file2.getName() + " " + file2.length());


        File file1 = new File("C:\\Users\\Minasyan\\Desktop\\po");
        System.err.println("file1 isFile: " + file1.isFile());
        System.err.println("file1 isDirectory: " + file1.isDirectory());
        System.err.println("file1Exists: " + file1.exists());
        System.out.println();

    }
}
