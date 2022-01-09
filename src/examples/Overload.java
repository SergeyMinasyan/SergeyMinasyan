package examples;

public class Overload {
    public static void main(String[] args) {
        int x = add(10, 20);
        int z = add(10, 10, 10);
        int s = add(1, 1, 1, 1);
        System.out.println(x);
        System.out.println(z);
        System.out.println(s);
    }

    static int add(int a, int b) {
        System.out.println("Overload1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overload1");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overload1");
        return a + b + c + d;
    }


}