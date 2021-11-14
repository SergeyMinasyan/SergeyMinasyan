package Static;

public class VarArgs {
    static void vaTest(int... v){
        System.out.println("arguments " + v.length ) ;
        for (int x : v) {
            System.out.println(x + " ");
        }
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(10,20,30);
        vaTest();
    }
}
