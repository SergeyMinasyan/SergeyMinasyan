package examples.try_catch;

public class Try4 {
    public static void main(String[] args) {
        int a = 0 ;
        try {
            int b = 40/a;
            System.out.println(b);
        }catch (ArithmeticException exe){
            System.err.println("Error!!! Divide by 0 " + exe);
//            System.out.println("Please input another number");
        }
//        System.out.println("after catch block");
    }
}
