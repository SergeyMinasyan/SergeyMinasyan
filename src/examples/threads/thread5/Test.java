package examples.threads.thread5;

public class Test { // patahakan hertakanutyun
    public static void main(String[] args) throws InterruptedException {
Thread thread = new Thread(new Runner());
thread.start();

//                MyThread myThread = new MyThread();
//        myThread.start();
//        System.out.println("Hello World");
//        MyThread myThread2 = new MyThread();
//        myThread2.start();


//        System.out.println("I am going to sleep");
//        Thread.sleep(2000);
//        System.out.println("I am awake");
    }
}
class Runner implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Bo");
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

class MyThread extends java.lang.Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}
