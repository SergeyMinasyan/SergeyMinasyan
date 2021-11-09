package Box_Overload;

public class ObjectOverload {
    int a, b ;
    ObjectOverload (int i , int j){
        a = i;
        b = j;
    }
    boolean equalTo(ObjectOverload o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }


}
