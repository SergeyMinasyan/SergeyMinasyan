package examples.generics.main;

public class Main {
    public static void main(String[] args) {
        MyClass<Integer, Double> obj = new MyClass<>(10, 19.2);
        MyClass<Double, String> obj2 = new MyClass<>(20.9, "Poxos");
        obj.showType();
        obj2.showType();
        NumericFns<Integer> iob = new NumericFns<>(4);
        System.out.println(iob.square());
    }
}
