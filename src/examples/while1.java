package examples;

public class while1 {
    public static void main(String[] args) {
        boolean isTrue = true;
        int f = 0;
        while (isTrue) {
            System.out.println(f);
            f += 2;
            if (f > 10) {
                isTrue = false;

            }
        }

    }
}