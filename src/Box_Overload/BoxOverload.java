package Box_Overload;

public class BoxOverload {
    double widht;
    double height;
    double depth;

    BoxOverload(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }

    BoxOverload() {
        widht = -1;
        height = -1;
        depth = -1;
    }
    BoxOverload(double len){
        widht = depth = height = len ;
    }

}
