package CallBack;

public interface Call {
    int EXIT = 12;

     void method();
     default void method1(){
         System.out.println("Ku");
     }
     static  void method2(){
         System.out.println("Kku");
     }
}



