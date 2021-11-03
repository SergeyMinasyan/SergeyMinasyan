package homework;

public class LessTest {
    public static void main(String[] args) {
        Less less = new Less();
        System.out.println(less.convert(5));
        System.out.println(less.calcAge(2));
        System.out.println(less.nextNumber(10));
        System.out.println(less.lessThanOrEqualToZero(10));
        System.out.println(less.reverseBool(true));
        int[] number1 = {1,2,3,4};
        int[] number2 = {1,2,2,2,2,2,2,2};
        System.out.println(less.maxLength(number1,number2));
    }
}
