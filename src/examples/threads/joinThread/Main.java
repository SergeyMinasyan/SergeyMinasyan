package examples.threads.joinThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread thread1 = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);

       thread1.start();
       thread1.join();
       thread2.start();
       thread2.join();
        System.out.println(1/0);
    }
}
