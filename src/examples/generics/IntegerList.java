package examples.generics;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {
    public static void main(String[] args) {

        Cell<Integer, String> stringCell = new Cell<>(16, "Poxos");
        Integer s = stringCell.getT();
        System.out.println(s);
        String ss = stringCell.getS();
        System.out.println(ss);
        List<Integer> ages = new ArrayList<>();
        ages.add(18);
        ages.add(20);
        System.err.println(ages.get(0));
        System.err.println(ages.get(1));
    }
}

class  Cell<T, S> {
    T t;
    S s;

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public Cell(T t, S s) {
        this.t = t;
        this.s = s;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}