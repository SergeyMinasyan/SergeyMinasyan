package homework;

public class Static {
   static int a = 4;

    void test(){
        System.out.println("Outr.test");
    }
   static class Inner{
        int b = 29;
        void showa(){
            System.out.println(a);
        }
    }
}

