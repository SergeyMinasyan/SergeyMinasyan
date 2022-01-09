package examples;

public class Void1 {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 20;
        hello(name, age);
    }

    static void hello(String title, int age) {
        System.out.println("Hello " + title);
        System.out.println("You are " + age);
    }

}
