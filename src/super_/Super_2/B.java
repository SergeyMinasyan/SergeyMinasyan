package super_.Super_2;

public class B extends A{
    int i ;
    B(int a , int b){
        i = b;
    }
    void show(){
        System.out.println("Super i : " + super.i);
        System.out.println(" i : " + i);
    }
}
