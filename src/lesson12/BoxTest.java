package lesson12;

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        box.volume();
        System.out.println(box.vol() * 2);
    }

}

