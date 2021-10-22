package lesson8;

public class Bolola0 {
    // Ունենք հետևյալ մասիվը՝
    //char[] bolola = {'b','o','l','o','l','a'};
    //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
    public static void main(String[] args) {
        char[] array = {'b', 'o', 'l', 'o', 'l', 'a'};
        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(array[2]);
        System.out.println(array[3]);
        //Ունենք հետևյալ մասիվը՝՝
        //char[] bolola = {'b','o','l','o','l','a'};
        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bolola[4] == 'l' && bolola[5] == 'y') {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        // Ունենք հետևյալ մասիվը՝
        //char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        //Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել
        // թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։ Պետք է գրել կոդ,
        // որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը,
        // առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char[] result = new char[5];
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
        }
    }




