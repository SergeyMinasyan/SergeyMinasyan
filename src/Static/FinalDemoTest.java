package Static;

import Box_Overload.BoxOverload;
import Box_Overload.Box_Overload;
import Example.Box;

public class FinalDemoTest {
    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        final int[] numbers = {2, 3, 44, 55, 6};
        System.out.println(numbers[0]);
        numbers[0] = 30;
        System.out.println(numbers[0]);
        numbers[0] = 44;
        System.out.println(numbers[0]);
        numbers[0] = 54;
        System.out.println(numbers[0]);
        final BoxOverload bo = new BoxOverload(20, 20, 10);
        bo.height = 30;
    }

}
