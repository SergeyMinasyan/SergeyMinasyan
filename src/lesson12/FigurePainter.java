package lesson12;

public class FigurePainter {
    int count;
    char symbol;

    FigurePainter(char c) {
        symbol = c;

    }

    void figureOne(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");

            }
            System.out.println();
        }
    }

    void figureTwo(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = count; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}