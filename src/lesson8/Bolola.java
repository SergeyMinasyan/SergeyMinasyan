package lesson8;

public class Bolola {
    public static void main(String[] args) {
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (char x : bolola) {
            if (x == c) {
                count++;
            }
        }
        System.out.println(count);
        char[] array = {' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a'};

    }
}


