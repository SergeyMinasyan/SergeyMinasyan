package Interface;

public class CallBackImpl implements Callback {
    @Override
    public void callback() {
        System.out.println("from impl 1");
    }
    public void method1(){
        System.out.println("from method 1 in Callbackimpl");
    }
}