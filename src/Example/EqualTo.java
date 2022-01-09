package Example;

public class EqualTo {
    int a, b;

    EqualTo(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(EqualTo ob) {
        if (ob.a == a && ob.b == b) return true;
        else return false;

        }
    }


    class EqualToTest {
        public static void main(String[] args) {
            EqualTo ob1 = new EqualTo(100, 20);
            EqualTo ob2 = new EqualTo(20, 10);
            EqualTo ob3 = new EqualTo(20, 10);
            System.out.println("ob1 == ob2 :" + ob1.equalTo(ob2));
            System.out.println("ob2 == ob3 : " + ob2.equalTo(ob3));
        }
    }

