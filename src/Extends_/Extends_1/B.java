package Extends_.Extends_1;

public class B extends A{
int i ;
B(int a , int b ){
    super.i  = a;
    i = b;

}
void show(){
    System.out.println("super" + super.i);
    System.out.println("i "+ i);
}
}

