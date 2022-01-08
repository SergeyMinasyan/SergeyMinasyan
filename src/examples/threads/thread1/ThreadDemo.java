package examples.threads.thread1;

public class ThreadDemo {
    public static void main(String[] args) {
    Thread myThread = new Thread(new NewThread(), "Демонстрационный поток");
    myThread.start();
    System.out.println(myThread.getName());
    System.out.println(myThread.getPriority());
    }
}
