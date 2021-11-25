package Super_8;

public class Triangle extends Figure{
    Triangle (double a , double b){
        super(a,b);

    }
    double area(){
        System.out.println("B области треугольника.");
   return dim2 * dim1 /2;
    }
}
