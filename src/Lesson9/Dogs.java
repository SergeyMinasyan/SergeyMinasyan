package Lesson9;

public class Dogs {
    public static void main(String[] args) {
        Dog dogs = new Dog();
        Dog dogs1 = new Dog();
        double volume;
        dogs.height = 12;
        dogs.depth = 2;
        dogs.width = 3;
        dogs.volume();
        dogs1.width = 1;
        dogs1.height = 2;
        dogs1.depth = 3;
        dogs1.volume();
    }
}