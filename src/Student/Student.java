package Student;

public class Student {
    private String name;
    private String surname;
    private String phoneNumber;
    private String lessonName;
    private int age;

    public Student(String name, String surname, String phoneNumber, String lessonName, int age) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}





