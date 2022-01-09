package examples.main1;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",30,50.4);
        Human human2 = new Human("Rick",3,20.4);
        System.out.println(human1.name);
        System.out.println(human2.weight);
        human1.eat();
        human1.drink();
    }
}
