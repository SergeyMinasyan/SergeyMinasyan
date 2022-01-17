package Java;

public class If_Else_If {
    public static void main(String[] args) {
        int a = 50, b = 30;
        char symbol1 = 'A', symbol2 = 'a';
        if (a == b || symbol1 != symbol2) {
            System.out.println(false);
        } else if (a < b) {
            System.out.println(true);
        } else {
            System.out.println("Error");
        }
    }
}

