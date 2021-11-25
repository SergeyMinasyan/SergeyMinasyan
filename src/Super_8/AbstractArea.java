package Super_8;

public class AbstractArea {
    public static void main(String[] args) {
        Triangle t = new Triangle(20, 20);
        Rectangle r = new Rectangle(30, 30);
        Figure figref;
        figref = r;
        System.out.println("Плoщaдь равнa" + figref.area());
        figref = t;
        System.out.println("Плoщaдь равнa " + figref.area());

    }
}
