package Box_Overload;

public class Box_Overload {
    public static void main(String[] args) {
        BoxOverload bo = new BoxOverload(2);
        BoxOverload bo1 = new BoxOverload(10,20,30);
        BoxOverload bo2 =  new BoxOverload();
        System.out.println(bo2.widht);
        System.out.println(bo2.height);
        System.out.println(bo2.depth);
        System.out.println(bo1.depth);
        System.out.println(bo1.height);
        System.out.println(bo1.widht);
        System.out.println(bo.widht);
        System.out.println(bo.height);
        System.out.println(bo.depth);
    }
}
