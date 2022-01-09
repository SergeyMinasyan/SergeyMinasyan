package Example;

public class Person2 {
    public static void main(String[] args) {
        Person1 ps = new Person1();
        ps.seyHello();
        ps.age = 20;
        ps.name = "Mamo";
        ps.speak();
        System.err.println(ps.calculatorYears());
        Person1 ps2 = new Person1();
        ps2.name = "Yura";
        ps2.age = 24;
        ps2.speak();
        System.err.println(ps2.calculatorYears());
    }
}

class Person1 {
    String name;
    int age;

    int calculatorYears() {
        int years = 40 - age;
        return years;
    }

    void speak() {
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }

    void seyHello() {
        System.err.println("Hello");
    }
}