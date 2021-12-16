package examples.enum2;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
switch (animal){
    case CAT:
        System.out.println("It's a cat");
        break;
    case DOG:
        System.out.println("It's a dog");
        break;
    case FROG:
        System.out.println("It's a frog");
        break;
}
        System.out.println(Animal.CAT.getTranslation());
        System.out.println(animal);
    }
}
