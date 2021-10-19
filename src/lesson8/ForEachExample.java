package lesson8;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println(sum);
        int x = 5;
        boolean b = false;
        for (int a : numbers) {
            if (a == x) {
                b = true;
                break;

            }
        }
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i %2 == 0) continue;
            System.out.println("");
            }
        }
    }
