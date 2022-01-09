package examples;

public class Break {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i == 10){
                break;
            }
            System.out.println(i);
            i++;

        }
        System.err.println("Мы вышли из цикла");
    }
}
