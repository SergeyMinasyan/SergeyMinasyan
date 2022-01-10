package examples.threads.sinxronizacia;

public class CallMe {
    void call(String msg){
        System.out.print("[" + msg);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("прервано");
        }
        System.out.println("]");
    }
}
class Caller implements Runnable{
String msg ;
CallMe target;
Thread t;

public Caller(CallMe targ, String s){
    target = targ;
    msg=s;
    t = new Thread(this);
    t.start();
}

    @Override
    public void run() {
target.call(msg);
    }
}