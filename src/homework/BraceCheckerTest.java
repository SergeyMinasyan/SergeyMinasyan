package homework;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "{he}llo {from} jav[a";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.chekc();
    }
}
