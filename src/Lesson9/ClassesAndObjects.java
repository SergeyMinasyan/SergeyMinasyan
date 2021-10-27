package Lesson9;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person Person1 = new Person();
        Person1.name = "Poxos";
        Person1.age = 50;
        System.err.println("Меня зовут " + Person1.name + ',' + "мне" + " " +  Person1.age + "лет");
        Person Person2 = new Person();
        Person2.name = "Petros";
        Person2.age = 40;
        System.err.println("Меня зовут " + Person2.name + ',' + "мне" + " " +  Person2.age + "лет");
        Person Person3 = new Person();
        Person3.name = "Martiros";
        Person3.age = 30;
        System.err.println("Меня зовут " + Person3.name + ',' + "мне" + " " +  Person3.age + "лет");
        }
    }
