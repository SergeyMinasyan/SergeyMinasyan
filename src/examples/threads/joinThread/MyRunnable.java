package examples.threads.joinThread;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 5; i > 0 ; i--) {
            System.out.println("It is thread2-> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
