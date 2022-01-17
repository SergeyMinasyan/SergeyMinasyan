package examples.threads.join;

public class thread8 extends Thread{
    public void run(){
        for (int i = 0; i < 4; i++) {
            System.out.println("Hello " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
Thread thread1 = new Thread(new Test());
       Thread thread3 = new Thread(new Test());

        thread8 thread2 = new thread8();
thread1.start();
        thread3.start();
thread1.join();



        thread2.start();

thread2.join();
        System.out.println("\033[0;32m" +"Finished");
    }
    }


    class Test implements Runnable{


        @Override
        public void run() {
            for (int i = 5; i >0; i--) {
                System.out.println("Hi " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            System.out.println(Thread.currentThread().getName());
        }
    }

