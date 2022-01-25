package examples.collections.generic.gen;

public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> printer1= new Printer(44);
        Printer<String> printer2 = new Printer("String");
        printer1.print();
        printer2.print();

    }
}
