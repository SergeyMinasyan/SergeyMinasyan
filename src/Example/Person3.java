package Example;

public class Person3 {
    public static void main(String[] args) {
        Person4 person = new Person4();
        person.name = "Yur";
        person.age= 20;
        System.out.println(person.calc());
        person.speak();
        Person4 person2= new Person4();
        person2.name = "Karen";
        person2.age  = 33;

    }
}
class Person4{
    String name;
    int age;
    int calc(){
        int years = 60- age;
        return years;
    }
    void speak(){
        System.out.println("My name is "+name+", I am "+age+" years old");
    }
}