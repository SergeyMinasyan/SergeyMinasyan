package FigureOverload;

public class FigureOveload {
    void figureOne(int count, char symbol) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");

            }
            System.out.println();
        }
    }

    void figureOnr(int count) {
        figureOne(count, '*');
    }

    void figureOne(int count, String symbol) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(symbol + " ");

            }
            System.out.println();
        }
    }
}
