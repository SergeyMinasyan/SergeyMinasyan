public class Exeptions {
    public static void main(String[] args) throws InterruptedException {
//new Thread(new Runnable() {
//    @Override
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}).start();
//        for (int i = 5; i >0 ; i--) {
//            System.out.println(i);
//            Thread.sleep(500);
//        }
//    }
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 5; i > 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        System.out.println(thread1.isAlive());
        thread1.join();
        System.out.println("hi");
        thread2.start();
        System.out.println(thread1.isAlive());
//new Thread(t1).start();
//new Thread(t2).start();

    }
}
