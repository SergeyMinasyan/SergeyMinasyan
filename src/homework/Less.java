package homework;

public class Less {
    long convert(int minutes) {
        return minutes * 60;

    }

    int calcAge(int years) {
        return years * 365;
    }

    int nextNumber(int number) {
        return ++number;

    }

    boolean isSameNum(int a, int b) {
        return a == b;
    }
    boolean lessThanOrEqualToZero(int number) {
        return number <= 0;
    }
    boolean reverseBool(boolean value) {
        return !value;
    }
    int maxLength(int[] array1, int[] array2) {
        return Math.max(array1.length, array2.length);
    }

    }





