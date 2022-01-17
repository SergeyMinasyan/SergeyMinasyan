package lessons.figure;

public class FigurePainter {
    public static void main(String[] args) {
        Figure figure = new Figure('$');
        figure.figureone();
        Figure figure1 = new Figure('#');
        System.out.println();
        figure1.figureone();
    }
}
