package lesson8;

public class Boolean {
    public static void main(String[] args) {

        int[] number = {1, 3, 4, 5, 8, 9, 10};
        int x = 5;
        boolean isfound = false;
        for (int a : number) {
            if (a == x) {
                isfound = true;
                break;
            }
        }
        System.out.println(isfound);
    }
}

