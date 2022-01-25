package Exams.extend;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        System.out.println(animal.age);
        animal.eat();

        Dog dog = new Dog();
        System.out.println(dog.age);
        dog.eat();

        Animal animal1 = new Dog();
        System.out.println(animal1.age);
        animal1.eat();

    }

}