package interface_;

public class CalBackTest  {
    public static void main(String[] args) {
//        System.out.println(CallBack.EXIT);
//        CallBack.method2();
        CallBackImpl ci = new CallBackImpl();
        ci.callback();
        ci.callMe();
        ci.method1();
ci.method2();
    }
}
