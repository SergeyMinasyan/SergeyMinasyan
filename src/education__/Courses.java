package education__;

import jdk.nashorn.internal.runtime.regexp.joni.ast.StringNode;

import java.util.Scanner;

public class Courses {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();


    private static final String EXIT = "0";
    private static final String ADD_LESSON = "1";
    private static final String ADD_STUDENT = "2";
    private static final String PRINT_STUDENTS = "3";
    private static final String PRINT_STUDENTS_BY_LESSON = "4";
    private static final String PRINT_LESSONS = "5";
    private static final String DELETE_LESSON_BY_NAME = "6";
    private static final String DELETE_STUDENT_BY_EMAIL = "7";
    private static final String SEARCH_LESSON_BY_NAME = "8";
    private static final String SEARCH_LESSON_BY_PRICE = "9";
    private static final String SEARCH_LESSON_BY_LECTURE_NAME = "10";
    private static final String SEARCH_STUDENTS_BY_LESSON = "11";
    private static final String COUNT_STUDENTS_BY_LESSON = "12";
    private static final String CHANGE_LESSON = "13";

    private static void printComands() {
        System.out.println("\033[0;33m" + "Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + ADD_LESSON + " for ADD_LESSON");
        System.out.println("Please input " + ADD_STUDENT + " for ADD_STUDENT");
        System.out.println("Please input " + PRINT_STUDENTS + " for PRINT_STUDENTS");
        System.out.println("Please input " + PRINT_STUDENTS_BY_LESSON + " for PRINT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + PRINT_LESSONS + " for PRINT_LESSONS");
        System.out.println("Please input " + DELETE_LESSON_BY_NAME + " for DELETE_LESSON_BY_NAME");
        System.out.println("Please input " + DELETE_STUDENT_BY_EMAIL + " for DELETE_STUDENT_BY_EMAIL");
        System.out.println("Please input " + SEARCH_LESSON_BY_NAME + " for SEARCH_LESSON_BY_NAME");
        System.out.println("Please input " + SEARCH_LESSON_BY_PRICE + " for SEARCH_LESSON_BY_PRICE");
        System.out.println("Please input " + SEARCH_LESSON_BY_LECTURE_NAME + " for SEARCH_LESSON_BY_LECTURE_NAME");
        System.out.println("Please input " + SEARCH_STUDENTS_BY_LESSON + " for SEARCH_STUDENTS_BY_LESSON");
        System.out.println("Please input " + COUNT_STUDENTS_BY_LESSON + " for COUNT_STUDENTS_BY_LESSON");
        System.out.println("Please input " + CHANGE_LESSON + " for CHANGE_LESSON");

    }

    public static void main(String[] args) {
        lessonStorage.add(new Lesson("English", "two years", "Gohar", 35.000));
        Lesson matem = new Lesson("English", "two years", "Gohar", 35.000);
        lessonStorage.add(matem);
        lessonStorage.add(new Lesson("Avtoschool", "1 year", "Poxos", 10.000));
        lessonStorage.add(new Lesson("Mathematic", "two years", "Poxosuhi", 20.000));
        studentStorage.add(new Student("Poxos","Poxosyan",40,"Poxosyan98@mail.ru","094737373",matem));
//        studentStorage.add(new Student("Pedros","Martirosyan",20,"Hakobyan98@mail.ru","093337373",));
        //   studentStorage.add(new Student("Martiros","Pedrsyan",50,"Pedrosyan98@mail.ru","094744373",));
        boolean isRun = true;
        while (isRun) {
            printComands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_LESSON:
                    add_lesson();
                    break;

                case ADD_STUDENT:
                    addStudent();
                    break;

                case PRINT_STUDENTS:
                    studentStorage.print();
                    break;

                case PRINT_STUDENTS_BY_LESSON:
                    printStudentsByLesson();
                    break;

                case PRINT_LESSONS:
                    lessonStorage.print();
                    break;

                case DELETE_LESSON_BY_NAME:
                    DeleteLessonByName();
                    break;

                case DELETE_STUDENT_BY_EMAIL:
                    DeleteStudentByEmail();
                    break;

                case SEARCH_LESSON_BY_NAME:
                    searchLessonByName();
                    break;
                case SEARCH_LESSON_BY_PRICE:
                    searchByPrice();
                    break;
                case SEARCH_LESSON_BY_LECTURE_NAME:
                    searchByLectureName();
                    break;
                case SEARCH_STUDENTS_BY_LESSON:
                    searchStudent();
                    break;
                case COUNT_STUDENTS_BY_LESSON:
                    countOfStudents();
                    break;
                case CHANGE_LESSON:
                    changeLesson();
                    break;

                default:
                    System.err.println("\033[40m" + "INVALID COMAND");


            }
        }
    }

    private static void changeLesson() {
        System.out.println("Please chose lesson's name");
        System.err.println("-----");
        lessonStorage.print();
        System.err.println("-----");
        String lessonName = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(lessonName);
        if (lesson != null) {
            System.out.println("please input duration");
            String duration = scanner.nextLine();
            System.out.println("please input lecturerName");
            String lecturerName = scanner.nextLine();
            System.out.println("please input price");
            double price = Double.parseDouble(scanner.nextLine());
            lesson.setDuration(duration);
            lesson.setPrice(price);
            lesson.setLecturerName(lecturerName);
        } else {
            System.err.println("\033[0;36m" + "Name of lesson's does not exist");
        }
    }


    private static void countOfStudents() {
        System.out.println("Please chose lesson's name");
        System.err.println("-----");
        lessonStorage.print();
        System.err.println("-----");
        String lessonsName = scanner.nextLine();
        Lesson lesson1 = lessonStorage.getByName(lessonsName);
        if (lesson1 != null) {
            studentStorage.countOFfStudents(lesson1);
        } else {
            System.err.println("\033[0;36m" + "Name of lesson's does not exist");

        }

    }

    private static void searchStudent() {
        System.out.println("Please chose lesson's name");
        System.err.println("-----");
        lessonStorage.print();
        System.err.println("-----");
        String nameOfLesson = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(nameOfLesson);
        if (lesson != null) {
            studentStorage.searchByName(lesson);
        } else {
            System.err.println("\033[0;36m" + "Name of lesson's does not exist");
        }
    }

    private static void searchByLectureName() {
        System.out.println("Please input lecture name");
        String name = scanner.nextLine();
        lessonStorage.earchLecture(name);
    }

    private static void searchByPrice() {
        System.out.println("From");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("To");
        double maxPrice = Double.parseDouble(scanner.nextLine());
        lessonStorage.searcByPrice(minPrice, maxPrice);
    }

    private static void searchLessonByName() {
        System.out.println("Please input keyword");
        String keyword = scanner.nextLine();
        lessonStorage.searcByName(keyword);
    }

    private static void DeleteStudentByEmail() {
        System.out.println("Please input student's email");
        System.err.println("-----");
        String email = scanner.nextLine();
        Student student = studentStorage.getByEmail(email);
        if (student != null) {
            studentStorage.deleteByEmail(email);
        }

    }

    private static void DeleteLessonByName() {
        System.out.println("Please choose lesson's name");
        System.err.println("-----");
        lessonStorage.print();
        System.err.println("-----");
        String name = scanner.nextLine();
        Lesson lesson = lessonStorage.getByName(name);
        if (lesson != null) {
            lessonStorage.deleteLesson(name);
        }

    }


    private static void printStudentsByLesson() {

    }


    private static void addStudent() {
        System.out.println("Please choose lesson's name");
        System.err.println("-----");
        lessonStorage.print();
        System.err.println("-----");
        String lesson = scanner.nextLine();
        Lesson lesson1 = lessonStorage.getByName(lesson);
        if (lesson1 != null) {
            System.out.println("please input student's name");
            String name = scanner.nextLine();
            System.out.println("please input student's surname");
            String surname = scanner.nextLine();
            System.out.println("please input student's age");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("please input student's email");
            String email = scanner.nextLine();
            Student student1 = studentStorage.getByEmail(email);
            System.out.println("please input student's phone");
            String phone = scanner.nextLine();
            Student student = new Student(name, surname, age, email, phone, lesson1);

            studentStorage.add(student);
            System.out.println("\033[0;36m" + "Thank you! Student was added");
        } else {
            System.err.println("\033[0;35m" + "Invalid name of lesson! Please choose lesson's again");
            addStudent();

        }
    }

    private static void add_lesson() {
        System.out.println("please input lesson's name");
        String name = scanner.nextLine();
        System.out.println("please input duration");
        String duration = scanner.nextLine();
        System.out.println("please input lecturerName");
        String lecturerName = scanner.nextLine();
        System.out.println("please input price");
        double price = Double.parseDouble(scanner.nextLine());
        Lesson lesson = new Lesson(name, duration, lecturerName, price);
        if (lessonStorage.getByName(lesson.getName()) != null) {
            System.err.println("Invalid name of lesson. Lesson with this name already exist");
        } else {
            lessonStorage.add(lesson);
            System.out.println("Thank you! Lesson was added");

        }
    }


}
