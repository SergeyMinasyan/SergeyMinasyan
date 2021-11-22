package Extends2;

import Box_Overload.BoxOverload;
import Extends1.BoxWeight;

public class Extend2 {
    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(10,10,10,10);
        BoxOverload bo = new BoxOverload();
        System.out.println(bo.widht);
    }
}
    
