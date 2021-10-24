package lesson8;

public class Charr {
    public static void main(String[] args) {
        //Ունենք հետևյալ մասիվը՝
        //char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        //Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից չկենտրոնանաք որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' ', ' '};
        int startindex = 0;
        int endindex = text.length - 1;
        while (startindex < endindex && text[startindex] == ' '){
            startindex++;
        }
while (endindex > startindex && text[endindex] == ' '){
    endindex--;
}
char[] result = new char[(endindex - startindex) +1];
int index = 0;
        for (int i = startindex; i <=endindex ; i++) {
result[index++] = text[i];
            System.out.print(text[i]);
        }

        }
        }
