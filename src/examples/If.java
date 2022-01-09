package examples;

public class If {
    public static void main(String[] args) {
//        if (5>5){
//            System.out.println("True");
//        }


//        if (5>5){
//            System.out.println("True");
//        }else {
//            System.err.println("False");
//        }
        int myInt = 10;
        if (myInt>10){
            System.out.println("true");
        }else if (myInt>20){
            System.err.println("False");
        }else {
            System.err.println("Error");
        }
    }
}
