package Example;

public class Massiv {
    public static void main(String[] args) {
        String[] astx = {"*", "**", "***", "****"};
        for (int i = 0; i < 4; i++) {
            System.out.println(astx[i]);
        }
        String[] astx2 = {"*", "*", "*", "*"};
        for (int i = 0; i < 4; i++) {
            System.out.println(astx2[i]);
            if (i != 3) {
                astx2[i + 1] = astx2[i] + "*";
            }
        }
        String[] astx3 = new String[5];
        astx3[0] = "*";
        for (int i = 0; i < 4; i++) {
            System.out.println(astx3[i]);
            astx3[i + 1] = astx3[i] + "*";
        }

        String[] astx4 = new String[4];
        astx4[0] = "*";
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                System.out.print(" ");
            }
            System.out.println(astx4[i]);
            if (i != 3) {
                astx4[i + 1] = astx4[i] + "*";
            }
        }


        String[] astx5 = new String[4];
        astx5[0] = "*";
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                System.out.print(" ");
            }
            System.out.println(astx5[i]);
            if (i != 3) {
                astx5[i + 1] = astx5[i] + "*";
            }
        }
        String[] astx6 = new String[4];
        astx6[0] = "*";
        System.out.println("+++++++++++++++++++");
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        String[] astx7 = new String[4];
        astx7[0] = " ";
        System.out.println("+++++++++++++++++++");
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}





