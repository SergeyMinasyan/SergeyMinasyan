package examples.threads.thread;

public class Mult {
    public static void main(String[] args) {
        MultyExam my = new MultyExam();
        MultyExam my2 = new MultyExam();
        System.out.println(my.isAlive());

        my.run();
        System.out.println(1/0);

//        my2.run();
//        my.start();
//        my2.start();
    }
}
