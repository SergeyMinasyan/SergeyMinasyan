package examples.threads.thread6;

import java.util.Scanner;

public class ThreadScanner {
    public static void main(String[] args) {
        MyThread my = new MyThread();
        my.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        my.shutDown();
    }
}
class MyThread extends Thread{
    private boolean IsRun = true;
    public void run(){
        while (IsRun){
            System.out.println("Hello");
          try{
              Thread.sleep(500);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
        }

    }
    public void shutDown(){
        this.IsRun = false;
    }
}
