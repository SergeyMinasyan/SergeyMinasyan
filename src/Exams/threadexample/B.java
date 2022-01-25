package Exams.threadexample;

public class B {
    public static void main(String[] args) {
        Thread t = new Thread(new A());
        t.start();
    }
}
