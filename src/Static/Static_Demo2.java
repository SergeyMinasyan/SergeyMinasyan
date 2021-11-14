package Static;

public class Static_Demo2 {
    static int a = 20;
    static int b = 40;
    static void callme(){
        System.out.println("a = " + a);
    }
}
class Static_Demo2Test{
    public static void main(String[] args) {
        Static_Demo2.callme();
        System.out.println("b = " + Static_Demo2.b);
    }
}
