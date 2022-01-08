package examples.threads;

public class CurrentThreadExample {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: " + thread);
        thread.setName("Му Thread");
        System.out.println("Пocлe изменения имени потока: " + thread);
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        System.err.println("Happy new year :)");


    }
}