package examples.threads;

public class Thread9 {
    public static void main(String[] args) throws InterruptedException {

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable t2 = new Runnable() {

            @Override
            public void run() {
                for (int i = 4; i > 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);

        thread2.start();
        thread2.join();
        thread1.start();
        thread1.join();

//        new Thread(new Runnable() {
//    @Override
//    public void run() {
//        for (int i = 0; i < 6; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}).start();
//        for (int i = 6; i >0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
    }
}

