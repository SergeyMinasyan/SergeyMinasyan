package Static;

public class Var_Args2 {
    static void VarTest2(String msg, int... v) {
        System.out.println(msg + v.length);
        for (int x : v) {
            System.out.print(x + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VarTest2("Poxos", 20, 20, 10);
        VarTest2("Martiros");
        VarTest2("Pedros", 11);
    }

}
