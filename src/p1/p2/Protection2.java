package p1.p2;

public class Protection2 extends p1.Protection{
    Protection2(){
        System.out.println("конструктор, унаследованный из другого пакета");
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = "+ n_pub);
    }
}
