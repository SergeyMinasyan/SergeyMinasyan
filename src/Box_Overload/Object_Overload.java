package Box_Overload;

public class Object_Overload {
    public static void main(String[] args) {
        ObjectOverload ob1 = new ObjectOverload(10,20);
        ObjectOverload ob2 = new ObjectOverload(20,10);
        ObjectOverload ob3 = new ObjectOverload(10,20);
        System.out.println("ob1 == ob2" + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3" + ob1.equalTo(ob3));

    }
}
