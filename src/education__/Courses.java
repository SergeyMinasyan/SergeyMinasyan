//package education__;
//
//import education__.model.Lesson;
//import education__.model.Student;
//import education__.storage.LessonStorage;
//import education__.storage.StudentStorage;
//import education__.util.DateUtil;
//
//import java.text.ParseException;
//import java.util.Date;
//import java.util.Scanner;
//
//public class Courses implements StudentBookCommands {
//
//    private static Scanner scanner = new Scanner(System.in);
//    private static StudentStorage studentStorage = new StudentStorage();
//    private static LessonStorage lessonStorage = new LessonStorage();
//
//
//    public static void main(String[] args) {
//        lessonStorage.add(new Lesson("English", "two years", "Gohar", 35.000));
//        Lesson matem = new Lesson("English", "two years", "Gohar", 35.000);
//        lessonStorage.add(matem);
//        lessonStorage.add(new Lesson("Avtoschool", "1 year", "Poxos", 10.000));
//        lessonStorage.add(new Lesson("Mathematic", "two years", "Poxosuhi", 20.000));
//        //   studentStorage.add(new Student("Poxos", "Poxosyan", 40, "Poxosyan98@mail.ru", "094737373", matem,"12/13/2019"));
////        studentStorage.add(new Student("Pedros","Martirosyan",20,"Hakobyan98@mail.ru","093337373",));
//        //   studentStorage.add(new Student("Martiros","Pedrsyan",50,"Pedrosyan98@mail.ru","094744373",));
//        boolean isRun = true;
//        while (isRun) {
//            StudentBookCommands.printComands();
//            String commands = scanner.nextLine();
//            switch (commands) {
//                case EXIT:
//                    isRun = false;
//                    break;
//                case ADD_LESSON:
//                    add_lesson();
//                    break;
//
//                case ADD_STUDENT:
//                    // addStudent();
//                    break;
//
//                case PRINT_STUDENTS:
//                    studentStorage.print();
//                    break;
//
//                case PRINT_STUDENTS_BY_LESSON:
//                    printStudentsByLesson();
//                    break;
//
//                case PRINT_LESSONS:
//                    lessonStorage.print();
//                    break;
//
//                case DELETE_LESSON_BY_NAME:
//                    DeleteLessonByName();
//                    break;
//
//                case DELETE_STUDENT_BY_EMAIL:
//                    DeleteStudentByEmail();
//                    break;
//
//                case SEARCH_LESSON_BY_NAME:
//                    searchLessonByName();
//                    break;
//                case SEARCH_LESSON_BY_PRICE:
//                    searchByPrice();
//                    break;
//                case SEARCH_LESSON_BY_LECTURE_NAME:
//                    searchByLectureName();
//                    break;
//                case SEARCH_STUDENTS_BY_LESSON:
//                    searchStudent();
//                    break;
//                case COUNT_STUDENTS_BY_LESSON:
//                    countOfStudents();
//                    break;
//                case CHANGE_LESSON:
//                    changeLesson();
//                    break;
//
//                default:
//                    System.err.println("\033[40m" + "INVALID COMAND");
//
//
//            }
//        }
//    }
//
//    private static void changeLesson() {
//        printLessonsList();
//        String lessonName = scanner.nextLine();
//        Lesson lesson = lessonStorage.getByName(lessonName);
//        if (lesson != null) {
//            System.out.println("please input duration");
//            String duration = scanner.nextLine();
//            System.out.println("please input lecturerName");
//            String lecturerName = scanner.nextLine();
//            System.out.println("please input price");
//            double price = Double.parseDouble(scanner.nextLine());
//            lesson.setDuration(duration);
//            lesson.setPrice(price);
//            lesson.setLecturerName(lecturerName);
//        } else {
//            System.err.println("\033[0;36m" + "Name of lesson's does not exist");
//        }
//    }
//
//    private static void printLessonsList() {
//        System.out.println("Please chose lesson's name seporate ,");
//        System.err.println("-----");
//        lessonStorage.print();
//        System.err.println("-----");
//    }
//
//
//    private static void countOfStudents() {
//        printLessonsList();
//        String lessonsName = scanner.nextLine();
//        Lesson lesson1 = lessonStorage.getByName(lessonsName);
//        if (lesson1 != null) {
//            studentStorage.countOFfStudents(lesson1);
//        } else {
//            System.err.println("\033[0;36m" + "Name of lesson's does not exist");
//
//        }
//
//    }
//
//    private static void searchStudent() {
//        printLessonsList();
//        String nameOfLesson = scanner.nextLine();
//        Lesson lesson = lessonStorage.getByName(nameOfLesson);
//        if (lesson != null) {
//            studentStorage.searchByName(lesson);
//        } else {
//            System.err.println("\033[0;36m" + "Name of lesson's does not exist");
//        }
//    }
//
//    private static void searchByLectureName() {
//        System.out.println("Please input lecture name");
//        String name = scanner.nextLine();
//        lessonStorage.earchLecture(name);
//    }
//
//    private static void searchByPrice() {
//        System.out.println("From");
//        double minPrice = Double.parseDouble(scanner.nextLine());
//        System.out.println("To");
//        double maxPrice = Double.parseDouble(scanner.nextLine());
//        lessonStorage.searcByPrice(minPrice, maxPrice);
//    }
//
//    private static void searchLessonByName() {
//        System.out.println("Please input keyword");
//        String keyword = scanner.nextLine();
//        lessonStorage.searcByName(keyword);
//    }
//
//    private static void DeleteStudentByEmail() {
//        System.out.println("Please input student's email");
//        System.err.println("-----");
//        String email = scanner.nextLine();
//        Student student = studentStorage.getByEmail(email);
//        if (student != null) {
//            studentStorage.deleteByEmail(email);
//        }
//
//    }
//
//    private static void DeleteLessonByName() {
//        System.out.println("Please choose lesson's name");
//        System.err.println("-----");
//        lessonStorage.print();
//        System.err.println("-----");
//        String name = scanner.nextLine();
//        Lesson lesson = lessonStorage.getByName(name);
//        if (lesson != null) {
//            lessonStorage.deleteLesson(name);
//        }
//
//    }
//
//
//    private static void printStudentsByLesson() {
//
//    }
//
//
//    private static void addStudent() throws ParseException {
//        printLessonsList();
//        System.out.println("Please choose lesson's name");
//        System.err.println("-----");
//        lessonStorage.print();
//        System.err.println("-----");
//        String lessons = scanner.nextLine();
//        String[] lessonsArray = lessons.split(",");
//        if (lessonsArray.length == 0) {
//            System.out.println("please choose lesson's");
//            return;
//        }
//         Lesson[]lessons = new Lesson[lessonsArray.length] ;
//        int index = 0;
//        for (String lesson : lessonsArray) {
//            Lesson lesson1 = lessonStorage.getByName(lesson);
//            if (lesson != null) {
//                // lessons[index++]= lesson;
//
//            } else {
//                System.out.println("please input correct lesson's name ");
//                return;
//            }
//        }
//        if (lesson != null) {
//            System.out.println("please input student's name,surname,age,email,phone,dateOfBirth");
//            String studentDataStr = scanner.nextLine();
//            String[] studentData = studentDataStr.split(",");
//            String name = studentData[0];
//            String surname = studentData[1];
//            int age = Integer.parseInt(studentData[2]);
//            String email = studentData[3];
//            String phone = studentData[4];
//            String dateOfBirth = studentData[5];
//            Student student = new Student(studentData[0], studentData[1], age, studentData[3], studentData[4], lessons);
//
//            studentStorage.add(student);
//            System.out.println("\033[0;36m" + "Thank you! Student was added");
//        } else {
//            System.err.println("\033[0;35m" + "Invalid name of lesson! Please choose lesson's again");
//            addStudent();
//
//        }
//
//
//        private static void add_lesson () {
//            System.out.println("please input lesson's name,duration,lecturerName,price");
//            String lessonDataStr = scanner.nextLine();
//            String[] lessonData = lessonDataStr.split(",");
//            if (lessonData.length == 4) {
//                double price = Double.parseDouble(lessonData[3]);
//                Lesson lesson = new Lesson(lessonData[0], lessonData[1], lessonData[2], price);
//                if (lessonStorage.getByName(lesson.getName()) != null) {
//                    System.err.println("Invalid name of lesson. Lesson with this name already exist");
//                } else {
//                    lessonStorage.add(lesson);
//                    System.out.println("Thank you! Lesson was added");
//                }
//            } else {
//                System.err.println("invalid data");
//            }
//
//        }
//    }
//}
