package lesson8;

public class Sampleswitch {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 0:
                    System.out.println("case = " + i);
                    break;
                case 1:
                    System.out.println("case = " + 1);
                    break;
                case 2:
                    System.out.println("case = " + i);
                    break;
                case 3:
                    System.out.println("case = " + i);
                    break;
                case 4:
                    System.out.println("case = " + i);
                    break;
                case 5:
                    System.out.println("case = " + i);
                    break;
                case 6:
                    System.out.println("case = " + i);
                    break;
                case 7:
                    System.out.println("case = " + i);
                    break;
                default:
                    System.out.println("case = " + i);


            }
        }
        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i poqt 4");
                    break;
                case 5 :
                case 6 :
                case 7 :
                case 8 :
                case 9 :
                    System.out.println("4-9");
                   break;


            }
        }
    }
}




