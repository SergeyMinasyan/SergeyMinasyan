package Super_3;

public class B1 extends A{
    int k ;
    B1(int s , int f , int g ){
        super(s,f);
        k = g ;

    }
    void show(){
        super.show();
        System.out.println("k :" + k);
    }
}
