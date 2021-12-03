package CallBack;

public class CallMe2 implements Call{
    @Override
    public void method() {
        System.out.println("kkb");
        Call.method2();
    }
}
