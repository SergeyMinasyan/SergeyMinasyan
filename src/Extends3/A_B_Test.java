package Extends3;

public class A_B_Test {
    public static void main(String[] args) {
        A a = new A();
        a.i = 10;
        a.name = "poxos";
        a.printName();
        System.out.println(a.i);
        B b = new B();
        System.out.println(b.i);
        System.out.println(b.name);
        b.j =12;
        b.i=13;
        b.name = "pedros";
        b.printj();
        b.printName();
        System.out.println(b.i);
    }
}
