package Lesson9;

public class Cats {
    public static void main(String[] args) {
        Cat Cats = new Cat();
        Cat Cats1 = new Cat();
        double volume;
        double vol;
        Cats1.width = 1;
        Cats1.depth = 3;
        Cats1.height = 5;

        Cats.width = 11;
        Cats.height = 12;
        Cats.depth = 14;

        System.out.println("Cats.width = " + Cats.width);
        volume = Cats.depth + Cats.width + Cats.height;
        System.err.println("Cats volume = " + volume);
        System.out.println("Cats1 height = " + Cats1.height);
        volume = Cats1.depth + Cats1.height + Cats1.width;
        System.err.println("Cats1 volume = " + volume);
        vol = Cats.height * Cats.width * Cats.depth;
        System.err.println("Cats vol = " + vol);
    }
}
