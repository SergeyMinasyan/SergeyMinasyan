package examples.interface1;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(10);
        Person person = new Person("Poxos");
        System.out.println(animal.id);
        animal.sleep();
        System.out.println(person.name);
        person.seyHello();
        person.showInfo();
        animal.showInfo();
    }

}