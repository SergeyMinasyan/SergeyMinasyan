package Static;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append("poxos");
        sb.append(' ');
        sb.append("petrosyan");
        System.out.println(sb);
        String s = sb.toString();
        System.out.println(s);

    }
}
