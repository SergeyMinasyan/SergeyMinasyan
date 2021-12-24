import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Minasyan\\Desktop\\java");
        System.out.println("file -> " + file.isFile());
        System.out.println("directory -> " + file.isDirectory());
        System.out.println("exists -> " + file.exists());
        File[] files = file.listFiles();
        for (File file1 : files) {
//            System.out.println("listFiles -> " + file1);
//            System.out.println("getName -> " + file1.getName());
//            System.out.println("absolutePath -> " + file1.getAbsolutePath());
//            System.out.println("getName & length -> " + file1.getName() + " " + file1.length());
            System.out.println("Read -> " + file1.canRead() + " " + file1.getName());
            System.out.println("Write -> " + file.canWrite() + " " + file1.getName());
            System.out.println("lastModified -> " +file1.lastModified() + " " +  file1.getName());
            long l = file.lastModified();
            System.out.println(new Date(l));

        }
       }


    }

