package fileExamples;

import java.io.*;

public class FileReadAndWrite {
    private static final String FILE_PATH = "C:\\Users\\Minasyan\\Desktop\\example1.txt";

    public static void main(String[] args) throws IOException {
     write();
//        read();

    }

    public static void write() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("Hello From Java\r\n");
            bw.write("Hello From Java  line2!!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void read() {
        try (BufferedReader inputStream = new BufferedReader(new FileReader(FILE_PATH))) {
            String line = "";
            while ((line = inputStream.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}