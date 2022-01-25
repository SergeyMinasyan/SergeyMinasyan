package Exams.threadexample;

public class A implements Runnable {
public void run(){
    for (int i = 0; i < 5; i++) {
        System.out.println(i);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    }
}
