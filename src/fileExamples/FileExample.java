package fileExamples;

import java.io.File;
import java.io.IOException;

public class  FileExample {
    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\Minasyan\\Desktop\\Новая папка");
        File file1 = new File("secret_message.txt");
//        System.out.println("Файл " + file.isFile() + " " + file.length());
//        System.out.println("Папка " + file.isDirectory() + " " + file.getParent());
//        System.out.println("Винчестр " + file.exists());
if(file1.exists()){
    System.out.println("That file exists");
}else{
    System.out.println("That file doesn't exist");
}
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
          

//        if (file.exists()){
//            file.delete();
//        }
//        System.out.println(file.exists());

//        if (!file.exists()){
//            if (file.createNewFile()){
//                System.out.println("File is created");
//            }
//        }
//        System.out.println(file.exists());


//        System.out.println(file.list());
//        File[] filess = file.listFiles();
//        for (File file1 : filess) {
//            System.out.println("getName " + file1.getName());
//            System.out.println("getAbsoluteFile " + file1.getAbsoluteFile());
//            System.out.println("length is  " + file.length());
//       if (file1.isFile()){
//           System.out.println(" " + "is file");
//       }else{
//           System.out.println(" " + "is directory");
//       }
//        }
    }
    }

