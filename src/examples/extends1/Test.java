package examples.extends1;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.eat();
        dog.sleep();

        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

    }
}
