package fileExamples;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample3 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\poxos");
        long modified = file.lastModified();
        System.out.println("modified: " + modified);
        System.out.println("NewDate: "+ new Date(modified));
           if (file.createNewFile()){
                System.err.println("File is created");
            }
        System.out.println("fileExists: " + file.exists());


//        if (file.exists()){
//            file.delete();
//            System.out.println("File is deleted");
//            System.out.println(file.exists());
//        }
        File file2 = new File("C:\\Users\\Minasyan\\Desktop\\test\\poxos");
        if (!file2.exists()){
            file2.mkdirs();
        }
        System.out.println("file2CanRead:  " + file2.canRead());
    }

}
