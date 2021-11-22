package Extends;

public class Simpleinheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();
        superOb.i = 22;
        superOb.j = 20;
        System.out.println("superOb ");
        superOb.showij();
        subOb.i = 22;
        subOb.j = 33;
        subOb.k = 44;
        System.out.println("subob : ");
        subOb.showij();
        subOb.showk();
    }
}
