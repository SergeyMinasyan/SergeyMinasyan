package Example;

public class Person5 {
    Person6 person6 = new Person6();

    Person6 person7 = new Person6();



}


class Person6{
    private   String name;
    private   int age;

    void nameOfPerson(String username) {
        name = username;
    }

    void seyHello() {
        System.out.println("Hello");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }
}

