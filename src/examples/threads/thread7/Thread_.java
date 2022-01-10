package examples.threads.thread7;

public class Thread_  implements Runnable{
String name;
Thread t ;
Thread_(String threadName){
    name=threadName;
    t = new Thread(this,name);
    t.start();
}
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            System.out.println("Its -> " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.err.println("Finished");
    }
}
