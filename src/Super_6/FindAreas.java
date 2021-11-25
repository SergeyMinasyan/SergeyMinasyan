package Super_6;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(10, 20);
        Triangle t = new Triangle(30, 40);
        Figure figref;
        figref = r;
        System.out.println("Площадь равна " + figref.area());
        figref = f;
        System.out.println("Площадь равна " + figref.area());
        figref = t;
        System.out.println("Площадь равна " + figref.area());
    }
}
