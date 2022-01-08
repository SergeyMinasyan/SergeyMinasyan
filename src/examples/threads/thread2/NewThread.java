package examples.threads.thread2;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Демонстрационный поток");
        System.out.println("Дoчepний поток создан: " + t);
        t.start();
    }


    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
            e.printStackTrace();
                }
        System.out.println("Дoчepний поток завершен.");

    }
        }
