package Exams.constructor;

public class A {
    public static void main(String[] args) {
        Person person1 = new Person("Poxos", 30);
        Person person2 = new Person("Pedros", 20);
        System.out.println(Person.count);
    }
}

class Person {
    private String name;
    private int age;
    public static int count;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }


}