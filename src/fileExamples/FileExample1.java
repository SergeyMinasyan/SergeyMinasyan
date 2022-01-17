package fileExamples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) {

        String path = "C:\\Users\\Minasyan\\Desktop";
        String fileName = "example1.txt";
        String fullPath= path + "\\" + fileName;
        File file = new File(fullPath);
        read(fullPath);

        System.out.println("file isFile: " + file.isFile());
        System.out.println("file1 isDirectory: " + file.isDirectory());
        System.out.println("file Exists: " + file.exists());
        System.out.println();


//        File file2 = new File("C:\\Users\\Minasyan\\Desktop\\java");
//        File[] files = file2.listFiles();
//        for (File file3 : files) {
//            System.out.print("file2ListFiles & file3length: " + file3 + " " + file3.length());
//      if (file2.isFile()){
//          System.out.println(" " + "is file");
//      }else {
//          System.out.println(" " + "is directory");
//      }
//        }
//        System.out.println("file2List: "+ file2.list());
//        System.out.println("file2GetName  & file2length: " + file2.getName() + " " + file2.length());
//
//
//        File file1 = new File("C:\\Users\\Minasyan\\Desktop\\po");
//        System.err.println("file1 isFile: " + file1.isFile());
//        System.err.println("file1 isDirectory: " + file1.isDirectory());
//        System.err.println("file1Exists: " + file1.exists());
//        System.out.println();

    }
    public static void read(String path) {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(path))) {
            String line = "";
            int lineCount=0;
            int[] lineNmb = new int[3];
            int index =0;
            while ((line = inputStream.readLine()) != null) {
                lineCount++;
                if(line.contains("Java"))
                {
                    lineNmb[index]=lineCount;
                    index++;
                }
            }
            for (int i = 0; i <lineNmb.length ; i++) {
                System.err.println(lineNmb[i]);
            }
//            System.err.println(lineNmb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
