package super_.Super_1;

public class B extends  A{
    double d ;
B() {
    super(10);
}
B(int a,double s){
    super(a);
    d  = s;

}
void showds(){
    System.out.println("su d" + super.i + " " + d);
}

}





