package examples.try_catch;

public class Try9 {
    public static void main(String[] args) {
        String str = "a234";
        int number = meth(str);
        System.out.println(number);
    }


    static int meth(String numberStr) {
        try {
            return Integer.parseInt(numberStr);

        } catch (NumberFormatException ex) {
            System.err.println("Number format is wrong");
            return 0;
        }
    }

}
