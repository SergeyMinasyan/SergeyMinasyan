package Box_Overload;

public class Test2 {
    int a, b;

    Test2(int i, int j) {
        a = i;
        b = j;

    }

    void meth(Test2 ob) {
        ob.a *= 2;
        ob.b /= 2;
    }
}
