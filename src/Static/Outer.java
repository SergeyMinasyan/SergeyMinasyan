package Static;

public class Outer {
    int a = 4;
    void test(){
        System.out.println("Outer.test");
    }
   static class  Inner{
        void showA(){
            int b = 5;
            System.out.println(b);
        }
    }
}
