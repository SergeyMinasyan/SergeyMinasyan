package homework;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] numbers = {1, 2, 3, 33, 5, 6};
        arrayUtil.max(numbers);
        arrayUtil.print(numbers);
        arrayUtil.min(numbers);
        System.out.println();
        arrayUtil.ZuygelEmentner(numbers);
        System.out.println();
        arrayUtil.KentElementner(numbers);
        System.out.println();
        arrayUtil.ZuygeriQanaky(numbers);
        arrayUtil.KenteriQanaky(numbers);
        arrayUtil.ElementneriGumary(numbers);
        arrayUtil.MijinTvabanakan(numbers);
    }
}
