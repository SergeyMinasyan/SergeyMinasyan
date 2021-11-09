package Box_Overload;

public class Test3_test {
    public static void main(String[] args) {
        Test3 ob1 = new Test3(2);
        Test3 ob2;
        ob2 = ob1.increByTen();
        System.out.println("ob1.a : " + ob1.a);
        System.out.println("ob2.a : " + ob2.a);
        ob2 = ob2.increByTen();
        System.out.println("ob2.a после увеличение ։ " + ob2.a);
        ob2 = ob2.increByTen();
        System.out.println("ob2.a после 2 увеличение ։ " + ob2.a);
    }
}
