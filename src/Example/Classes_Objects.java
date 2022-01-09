package Example;

public class Classes_Objects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.seyHello();
        person1.setName("Martiros", 14);
        person1.setAge(11);
        person1.speak();

        Person person2 = new Person();
        person2.setName("Poxosik", 23);
        person2.speak();


    }
}

class Person {
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