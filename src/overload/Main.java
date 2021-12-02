package overload;

public class Main {
    public static int summ(int a, int b){
return a+b;

}
public static int sum(int a , int b , int c ){
        return a+b+c;
}

    public static void main(String[] args) {
        System.out.println(summ(18,29));
        System.out.println(sum(29,30,40));
    }
}

