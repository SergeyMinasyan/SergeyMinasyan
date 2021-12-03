package interface_;

public class CallBack2Impl implements CallBack{
    @Override
    public void callback() {
        System.out.println("from impl 2");
    }

    @Override
    public void callMe() {
        System.out.println("from impl 2");

    }
}
