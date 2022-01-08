package examples.threads.joinThread;

public class MyThread extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("It is thread1-> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
