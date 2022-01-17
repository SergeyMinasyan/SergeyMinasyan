package Dynamic_Array;

public class DynamicArray {
    public static void main(String[] args) {
        Dynamic_Array da = new Dynamic_Array();
            //da.add(30);
            //da.add(20);
            //da.add(10); // 30 20 10
            // System.out.println(da.getByIndex(-1)); // -1 error

        System.err.println(da.isEmpty());
        da.add(31);
        System.err.println(da.isEmpty());
        System.err.println(da.isExist(31));
        //da.print();
        //da.delete(4);
        //System.out.println();
        //da.print();
        //da.delete(2);
        //System.out.println();
        //da.print();
        //da.add(11);
        //System.out.println();
        //da.print();
        //da.set(10,2);
        //System.out.println();
        //da.print();
        //da.add(2,3);
        //System.out.println();
        //da.print();
        int [] num = {1,2,2,2,2};
        da.add(num);
        da.print();
        System.out.println();
        System.out.println(da.isExist(20));
        System.out.println(da.isEmpty());
    }
}
