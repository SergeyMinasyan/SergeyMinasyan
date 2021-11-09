package Box_Overload;

public class Test2_test {
    public static void main(String[] args) {
        Test2 ob =new Test2(20,10);
        System.out.println("ob.a & ob.b до вызовa: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a & ob.b после вызовa: " + ob.a + " " + ob.b);


    }
}
