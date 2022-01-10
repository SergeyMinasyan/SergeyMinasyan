package examples.threads.thread7;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        Thread_ ob1 = new Thread_(("One"));
        Thread_ ob2 = new Thread_(("Two"));
        Thread_ ob3 = new Thread_(("Tree"));
        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());
        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("Its 2-> " + i);
            Thread.sleep(500);
        }

        System.out.println(ob1.t.isAlive());
        System.out.println(ob2.t.isAlive());
        System.out.println(ob3.t.isAlive());
        }
    }

