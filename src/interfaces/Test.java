package interfaces;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(10);
        Person person = new Person("Bob");
        animal.showInfo();
        System.out.println("animal.id");
        person.showInfo();
        person.sayHello();

        Info info1 = new Animal(12);
        Info info2 = new Person("Karen");
        info1.showInfo();
        info2.showInfo();
        outputInfo(info1);
        outputInfo(info2);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }

}