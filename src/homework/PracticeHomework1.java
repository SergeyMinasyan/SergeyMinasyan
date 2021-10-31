package homework;

public class PracticeHomework1 {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
        //long convert(int minutes) {
        //return 0;
        ph.second = 60;
        ph.convert(5);
        System.out.print("Count of second ");
        System.out.println(ph.convert(5));

        //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
        //boolean isSameNum(int a, int b) {
        //return false;
        System.out.println(ph.isSameNum(20, 220));

        //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
        //մնացած դեպքերում վերադարձնել false
        //boolean lessThanOrEqualToZero(int number) {
        //return false;
        System.out.println(ph.lessThanOrEqualToZero(50));

        //վերադարձնել երկու մասիվի ամենամեծ length-ը
        //int maxLength(int[] array1, int[] array2) {
        //return 0;
        int[] number = {1, 3, 4, 5, 6, 10};
        int[] number1 = {2, 3, 8, 19, 20, 30, 7, 89};
        System.out.println(ph.maxLenght(number, number1));

        //վերադարձնել տրված թվի հաջորդ թիվը
        //int nextNumber(int number) {
        // return 0;
        System.out.println(ph.nextNumber(20));

        //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
        //boolean reverseBool(boolean value) {
        //return false;
        System.out.println(ph.viceVersa(true));
    }
}


