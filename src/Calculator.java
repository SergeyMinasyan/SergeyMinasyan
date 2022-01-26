import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number ");
        int num2 = scanner.nextInt();
        System.out.print("+ or - or / or * ");
        String c = scanner.next();
  switch (c){
      case "+":
          System.out.println(num1 + num2);
          break;
    case "-":
          System.out.println(num1 - num2);
          break;
    case "*":
          System.out.println(num1 * num2);
          break;
    case "/":
          if (num2 == 0){
              System.err.println("ERROR");
          }else
              System.out.println(num1 / num2);
        break;
      default:
          System.err.println("Error");

  }
    }
}
