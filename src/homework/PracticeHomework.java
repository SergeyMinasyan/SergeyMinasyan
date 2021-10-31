package homework;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    //long convert(int minutes) {
    //return 0;
    int second;
    int count;
    long convert(int minutes) {
        return second * minutes;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    // boolean isSameNum(int a, int b) {
    // return false;
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    //boolean lessThanOrEqualToZero(int number) {
    //return false;
    boolean lessThanOrEqualToZero(int number) {
        if (number <= 0) {
            return false;
        } else {
            return true;
        }
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    //int maxLength(int[] array1, int[] array2) {
    //return 0
    int maxLenght(int[] number, int[] number1) {
        if (number.length > number1.length)
            return number.length;
        return number1.length;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    //int nextNumber(int number) {
    // return 0;
    int nextNumber(int nmb) {
        return ++nmb;
    }
    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    //boolean reverseBool(boolean value) {
    //return false;
    boolean viceVersa(boolean value) {
        return !value;

    }
}
