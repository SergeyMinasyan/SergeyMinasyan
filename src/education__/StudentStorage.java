package education__;

public class StudentStorage {
    private Student[] student = new Student[10];
    private int size = 0;

    public void add(Student student1) {
        if (student.length == size) {
            extend();
        }
        student[size++] = student1;
    }

    private void extend() {
        Student[] temp = new Student[student.length + 10];
        System.arraycopy(student, 0, temp, 0, student.length);
        student = temp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(student[i]);
        }
    }

    public Student getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (student[i].getEmail().equals(email)) {
                return student[i];
            }
        }
        return null;
    }

    public void searchByName(Lesson lesson) {
        for (int i = 0; i < size; i++) {
            if (student[i].getLesson().equals(lesson)) {
                System.out.println(student[i]);
            }
        }
    }

    public void countOFfStudents(Lesson lesson) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (student[i].getLesson().equals(lesson)) {
                count++;
            }
        }
        System.out.println("\033[0;34m" + "Count of " + lesson.getName() + " studens is " + count);
    }


    public void deleteByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (student[i].getEmail().equals(email)){
                deleteByIndex(i);
                break;
            }
        }

    }
    private void deleteByIndex(int index){
        for (int i = index+1; i < size; i++) {
            student[i-1] = student[i];

        }
        size--;
    }
}

