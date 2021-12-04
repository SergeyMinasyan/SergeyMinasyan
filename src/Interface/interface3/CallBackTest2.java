package Interface.interface3;

import Interface.interface3.CallBackImpl;

public class CallBackTest2 {
    public static void main(String[] args) {
        CallBackImpl callBack = new CallBackImpl();
        callBack.callback();
        callBack.method1();
    }
}
