package examples.try_catch;

public class Try7 {
    public static void main(String[] args) {
        int[] num = {1,2,4};
        try{
            System.out.println(num[3]);
            System.out.println("Good");
        }catch (Exception ex){
            System.err.println("Error");
        }
    }
}
