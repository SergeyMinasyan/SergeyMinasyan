package lesson12;

public class FigureTest {
    public static void main(String[] args) {
        FigurePainter fp = new FigurePainter('$');
        fp.figureOne(8);
        fp.figureTwo(8);
        FigurePainter fp1 = new FigurePainter('%');
        fp1.figureTwo(8);
        fp1.figureOne(8);
    }
}
