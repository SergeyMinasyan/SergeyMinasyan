package Lesson9;

public class Paxlava {
        void paxlava(int count, char z) {
            for (int i = 0; i < count; i++) {
                for (int j = count; j > i; j--) {
                    System.out.print("  ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
        }
        void paxlava2(int count, char z){
            for (int i = 0; i < count; i++) {
                for (int j = 6; j >= i; j--) {
                    System.out.print(z + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

