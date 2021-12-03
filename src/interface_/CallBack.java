package interface_;

public interface CallBack {
    int EXIT = 0 ;
    void callback();
    void callMe();
   default void method1(){
       System.out.println("kuku");

    }
    static void method2 (){
        System.out.println("kuku4");
    }
}
