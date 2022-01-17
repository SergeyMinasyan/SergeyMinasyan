package Student;

public class StudentTest {
    public static void main(String[] args) {
        Student poxos = new Student("Poxos", "Poxosyan", "093444444", "Java", 20);
        System.out.println(poxos.getName());
        poxos.setName("poxosik");
        System.out.println(poxos.getName());
    }

}
