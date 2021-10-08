package Example;

public class Massiv {
    public static void main(String[] args) {
            String[] astx = {"*","**","***","****"};
        for (int i = 0; i < 4; i++) {
            System.out.println(astx[i]);
        }
        String[] astx2 = {"*","*","*","*"};
        for (int i = 0; i < 4; i++) {
            System.out.println(astx2[i]);
            if(i!=3){
                astx2[i+1]=astx2[i]+"*";
            }
        }
        String[] astx3 = new String[5];
        astx3[0]="*";
        for (int i = 0; i < 4; i++) {
            System.out.println(astx3[i]);
            astx3[i+1]=astx3[i]+"*";
        }


            }

        }






