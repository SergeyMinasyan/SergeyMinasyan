package lessons_.homework.charArray;

public class CharArray {
    public static void main(String[] args) {
        //                   0    1    2    3    4    5
//        char[] lessons_.homework.charArray = {'b', 'o', 'l', 'o', 'l', 'y'};

//        //առաջին էլեմենտը
//        System.out.println(lessons_.homework.charArray[0]);
//        //վերջի էլեմենտը
//        System.out.println(lessons_.homework.charArray[lessons_.homework.charArray.length - 1]);
//        //նախավերջինը
//        System.out.println(lessons_.homework.charArray[lessons_.homework.charArray.length - 2]);
//        //մեջտեղի էլեմենտը
//        System.out.println(lessons_.homework.charArray[lessons_.homework.charArray.length / 2]);

//        int count = 0;
//        char c = 't';
//        for (int i = 0; i < lessons_.homework.charArray.length; i++) {
//            if (lessons_.homework.charArray[i] == c) {
//                count++;
//            }
//        }
//        System.out.println("count of '" + c + "' = " + count);
//
//        System.out.println(lessons_.homework.charArray[lessons_.homework.charArray.length / 2 - 1]);
//        System.out.println(lessons_.homework.charArray[lessons_.homework.charArray.length / 2]);

//        if (lessons_.homework.charArray[lessons_.homework.charArray.length - 2] == 'l' &&
//                lessons_.homework.charArray[lessons_.homework.charArray.length - 1] == 'y') {
//            System.out.println(true);
//        } else {
//            System.out.println(false);
//        }

        //                   0    1    2    3    4    5
//        char[] lessons_.homework.charArray = {'b', 'o', 't', 'b', 'r', 'b'};
//
//        boolean isBob = false;
//
//        for (int i = 0; i < lessons_.homework.charArray.length - 2; i++) {
//            if (lessons_.homework.charArray[i] == 'b' && lessons_.homework.charArray[i + 2] == 'b') {
//                isBob = true;
//                break;
//            }
//        }
//        System.out.println(isBob);


//        char[] text = {' ', ' ', ' ', ' ', 'h', 'e', 'l', 'l', 'o', ' ', 'j', 'a', 'v', 'a', 'S','c', 'r', 'i', 'p', 't', ' ',' ' ,' ',' ', ' '};
//        int startIndex = 0;
//        int endIndex = text.length - 1;
//
//        while (startIndex < endIndex && text[startIndex] == ' ') {
//            startIndex++;
//        }
//
//        while (startIndex < endIndex && text[endIndex] == ' ') {
//            endIndex--;
//        }
//
//        char[] result = new char[(endIndex - startIndex) + 1];
//
//        int index = 0;
//        for (int i = startIndex; i <= endIndex; i++) {
//            result[index++] = text[i];
//        }
//
//        for (int i = 0; i < result.length; i++) {
//            System.out.print(result[i]);
//        }


    }

    char[] trim(char[] text) {
        int startIndex = 0;
        int endIndex = text.length - 1;

        while (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }

        while (startIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }

        char[] result = new char[(endIndex - startIndex) + 1];

        int index = 0;
        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        return result;
    }
}
