package lesson12;

public class Box {
    int width;
    int depth;
    int height;

    Box(int width, int height, int depth) {
        this.depth = depth;
        this.height = height;
        this.width = width;

    }
    void volume(){
        System.out.println(height+depth+width);
    }
    int vol(){
      return   height + depth + width;
    }
}
