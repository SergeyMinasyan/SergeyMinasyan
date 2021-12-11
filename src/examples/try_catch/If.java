package examples.try_catch;

public class If {
    public static void main(String[] args) {
        String str = "a";
        int number = meth(str);
        if (number == 0) {
            System.out.println("Please try another number");
        }else {
            System.out.println(number);
        }
    }

    static int meth(String stringStr) {
        try {
return Integer.parseInt(stringStr);
        } catch (NumberFormatException ex) {
            System.err.println("Number format is wrong");
            return 0;
        }
    }

}
