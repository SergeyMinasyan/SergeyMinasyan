package education__;

public interface StudentBookCommands {
  static void printComands() {
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
 String EXIT = "0";
    
 String ADD_LESSON = "1";
    
 String ADD_STUDENT = "2";
    
 String PRINT_STUDENTS = "3";
    
 String PRINT_STUDENTS_BY_LESSON = "4";
    
 String PRINT_LESSONS = "5";
    
 String DELETE_LESSON_BY_NAME = "6";
    
 String DELETE_STUDENT_BY_EMAIL = "7";
    
 String SEARCH_LESSON_BY_NAME = "8";
    
 String SEARCH_LESSON_BY_PRICE = "9";
    
 String SEARCH_LESSON_BY_LECTURE_NAME = "10";
    
 String SEARCH_STUDENTS_BY_LESSON = "11";
    
 String COUNT_STUDENTS_BY_LESSON = "12";
    
 String CHANGE_LESSON = "13";



}
