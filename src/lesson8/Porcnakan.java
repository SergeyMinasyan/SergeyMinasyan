package lesson8;

public class Porcnakan {
    public static void main(String[] args) {
        int count = 0;
        int a = 10;
        int b = 20;
        while (a < b) {
            System.out.println(count + " " + "a>b");
            a++;
            count++;
        }
        int sum = 20;
        switch (sum) {
            case 2:
                System.out.println("case = 2");
                break;
            case 10:
                System.out.println("case = 20");
                break;
            default:
                System.out.println("case is not found");
        }
        int[] numbers = new int[4];
        numbers[0] = 10;
        numbers[1] = 30;
        numbers[2] = 20;
        numbers[3] = 40;
        for (int x : numbers) {

            if (x == numbers[2]) {
                break;
            }
            System.out.println(x);

        }

        }

    }


