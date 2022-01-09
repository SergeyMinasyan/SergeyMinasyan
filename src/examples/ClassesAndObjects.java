package examples;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.name = "Poxos";
        person1.age = 20;
        person1.sayHello();
        person1.speak();

    }
}
class Person{
    String name;
    int age;

    void speak(){
        System.out.println("My name is " + name + " I am " + age + " years old");
    }
    void sayHello(){
        System.out.println("Hello");
    }
}
