package examples.try_catch;

public class Try6 {
    public static void main(String[] args) {
        try {
            int[] array = new int[-2];

        }catch (NegativeArraySizeException ex){
            System.err.println("Error");
        }
    }
}