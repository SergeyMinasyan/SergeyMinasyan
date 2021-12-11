package examples.try_catch;

public class Try10 {
    public static void main(String[] args) {
        String name = null;
        if (name != null) {
            System.out.println(meth(name));
        }
    }
    static String meth(String name) {
        return name.trim();
    }
}

