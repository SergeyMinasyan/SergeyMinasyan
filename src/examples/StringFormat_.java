package examples;

public class StringFormat_ {
    public static void main(String[] args) {
        String name = "Poxos";
        int age = 10;
        String surname = "Poxosyan";
        System.out.println(name + ' ' + surname + " " + age);
        System.err.println(String.format("Hi %s %s your age is %d", name, surname, age));
    }
}
