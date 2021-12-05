package lessons_.classwork;

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
        int max = 0;
        for (int s : number) {
            if (s > max) {
                max = s;
            }
        }
        System.out.println(max);
        int min = number[0];
        for (int d : number) {
            if (d < min) {
                min = d;
            }
        }
        //վերջին թիվը
        System.out.println(min);
        for (int f : number) {
        }
        System.out.println(number[number.length - 1]);
        //վերջին ինդեքսը
        for (int s : number) {

        }
        System.out.println(number.length - 1);
    }
}

