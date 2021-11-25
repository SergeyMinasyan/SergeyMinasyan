package Super_3;

public class Override {
    public static void main(String[] args) {
        B b = new B(10,20,30);
        b.show();
        A a = new A(11,22);
        a.show();
        B1 b1 = new B1(33,44,55);
        b1.show();

    }
}
