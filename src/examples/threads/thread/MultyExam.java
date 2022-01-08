package examples.threads.thread;

public class MultyExam extends  Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Happy new year");
    }
}
