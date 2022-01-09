package Example;

public class ___V {
    static void vaTest(int... v) {
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    static void vaTest(String name,int... v) {
        for (int i : v) {
            System.out.print(name +" "+ i + " ");
        }
        System.out.println();

    }
    static void vaTest(int a, double... v) {
        for (double v1 : v) {
            System.out.print(v1 + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(10, 20, 30);
        vaTest();
        vaTest(10,10.3,20.3);
        vaTest("Poxosik",21);
    }
}




