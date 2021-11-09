package Box_Overload;

public class Test_test {
    public static void main(String[] args) {
        Test ob = new Test();
        int a = 20, b = 30;
        System.out.println("a & b до вызовa: " + a + " " + b);
        ob.meth(20, 30);
        System.out.println("ob.a & ob.b до вызовa: " + a + " " + b);

    }
}
