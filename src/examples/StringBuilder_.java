package examples;

public class StringBuilder_ {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my");
        sb.append(" name is Serg").append(" :)");
        System.out.println(sb.toString());

    }
}
