package examples.extends_;

public class Test {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);
        a.meth();
    }
}
