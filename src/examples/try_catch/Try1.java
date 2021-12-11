package examples.try_catch;

public class Try1 {
    public static void main(String[] args) {
        int[] nums = new int[4];
        try {
            System.out.println("Это начало");
            nums[7] = 10;
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.err.println("О нет у нас ошибка");
        }
    }
}
