package examples.try_catch;

import education__.model.Student;

public class Try8 {
    public static void main(String[] args) {
        Student student = null;
        try{
            System.out.println(student.getEmail());
        }catch (NullPointerException ex){
            System.err.println("Student is null");
        }

        }
    }

