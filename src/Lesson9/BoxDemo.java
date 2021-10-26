package Lesson9;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox1 = new Box();
        myBox.width = 10.0;
        myBox.height = 10.0;
        myBox.depth = 10.0;
        System.out.println(myBox.volume() + 2);
        myBox1.width = 16.0;
        myBox1.height = 15.0;
        myBox1.depth = 14.0;
        System.err.println(myBox1.volume());
    }

}

