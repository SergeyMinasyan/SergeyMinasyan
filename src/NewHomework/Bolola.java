package NewHomework;

public class Bolola {
    public static void main(String[] args) {
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola1 = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola1.length; i++) {
            if (bolola1[i] == c) {
                count++;
            }
        }
        System.out.println("Count of c = " + count);
        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] bolola2 = {'b', 'o', 'd', 'o', 'l', 'a'};
        System.out.println(bolola2[bolola2.length / 2]);
        System.out.println(bolola2[bolola2.length / 2 - 1]);
        char[] bolola3 = {'b', 'o', 'l', 'o', 'l', 'a'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        if (bolola3[bolola3.length - 1] == 'y' && bolola3[bolola3.length - 2] == 'l') {
            System.out.println(true);
        } else
            System.out.println(false);
        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bolola4 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean isBob = false;
        for (int i = 0; i < bolola4.length - 2; i++) {
            if (bolola4[i] == 'b' && bolola4[i + 2] == 'b') {
                isBob = true;
            }
        }
        System.out.println(isBob);

        //Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։

        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' ', ' '};
        int startindex = 0;
        int endindex = text.length - 1;
        while (startindex < endindex && text[startindex] == ' ') {
            startindex++;
        }
        while (endindex > startindex && text[endindex] == ' ') {
            endindex--;
        }
        char[] result = new char[(endindex - startindex) + 1];
        int index = 0;
        for (int i = startindex; i <= endindex; i++) {
            result[index++] = text[i];
            System.out.print(text[i]);
        }
        System.out.println();
        char[] text2 = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result2 = new char[5];
        int j = 0;
        for (int i = 0; i < text.length; i++) {
            switch (text[i]) {
                case ' ':
                    break;
                default:
                    result[j] = text[i];
                    System.out.print(result[j]);
            }
        }
        System.out.println();
        char[] text4 = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};
        for (int i = 2; i < text.length - 2; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);

            }
        }
    }
    }
