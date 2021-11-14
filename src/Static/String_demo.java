package Static;


public class String_demo {
    public static void main(String[] args) {
        //ՏՊԵԼ ԱՌԱՆՑ ՊՌԱԲԵԼՆԵՐԻ
        String name = "Poxos";
        System.out.println(name.trim());

        //ՏՊԵԼ ԲՈԼՈՐԸ ՓՈՔՐԱՏԱՌ
        System.out.println(name.toLowerCase());

        //ՏՊԵԼ ԲՈԼՈՐԸ ՄԵԾԱՏԱՌ;
        System.out.println(name.toUpperCase());

        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append("Poxos");
        sb.append(' ');
        sb.append("Poxosyan");
        String s = sb.toString();
        System.out.println(s);

        //ԿՏՊԵ ԹԱՐՍ
        StringBuilder stringBuilder = new StringBuilder("Martiros");
        String reverse = stringBuilder.reverse().toString();
        System.out.println(reverse);

        //ԲԱԺՆԵԼ ՄԱՍԵՐԻ
        String name2 = "Poxos:Poxosyan";
        String[] split = name2.split(":");
        for (String s1 : split) {
            System.out.println(s1);
        }

        //ԵԹԵ ԿՍԿՍՎԻ X ՏԱՌՈՎ
        boolean p = name2.startsWith("o");
        System.out.println(p);

        //ԵՏԵ ԿՎԵՐՋԱՆԱ X ՏԱՌՈՎ
        System.out.println(name.endsWith("os"));

        //CHAR - STRING
        char[] chars = {' ', ' ', 'a', 'b', 'c'};
        String text = new String(chars);
        System.out.println(text.trim());

        //IS EMPTY
        String text2 = " ";
        System.out.println(text2.isEmpty());

        //ԿԿԻՍԵ ԻՆԴԵՔՍՈՎ
        String text3 = "pedros pedrosyan";
        System.out.println(text3.substring(0, 6));
        System.out.println(text3.substring(7, 16)); // kam 7

        //String - Int
        String numberStr = "1234";
        int number = Integer.parseInt(numberStr);
        double d = Double.parseDouble(numberStr);
        System.out.println(d);
        System.out.println(number);

        //String text = "Poxos Poxosyan";
        //String name = text.substring(0, 5);
        //String surname = text2.substring(6);
        // System.out.println(name);
        //System.out.println(surname);


    }

}

