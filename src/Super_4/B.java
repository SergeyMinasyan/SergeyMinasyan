package Super_4;

public class B extends A{
    int k ;
    B(int g , int h , int d){
        super(g,h);
        k = d ;

    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
