package lessons.figure;

public class Figure {
    char simbol;

    Figure(char c){
        simbol = c;
    }

    void figureone() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(simbol + " ");
            }
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");
            }
        }
    }
}


