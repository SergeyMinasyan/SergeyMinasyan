package Java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите роль ");
        String role = scanner.nextLine();
        System.out.print("Введите пароль ");
        String password =  scanner.nextLine();
        if (role.equals("Admin") && password.equals("12345")){
            System.out.println("Hello Admin");
        }else {
            System.out.println("Все пользовытели");
        }
    }
}
