import java.awt.*;
import java.io.*;

public class BufferReader_ {
    public BufferReader_() throws FileNotFoundException {
    }

    public static void main(String[] args) throws IOException {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter("C:\\Users\\Minasyan\\Desktop\\exam.txt"));
            br.write("Hellooooooooooo");
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\Minasyan\\Desktop\\exam.txt"));
        System.out.println(bf.read());
    }

}