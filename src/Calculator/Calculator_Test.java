package Calculator;

public class Calculator_Test {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.err.println(calculator.gumarum(10, 10));
        System.err.println(calculator.hanum(10, 10));
        System.err.println(calculator.bazmapatkum(10, 10));
        System.err.println(calculator.bajanum(10, 10));

        int result = calculator.gumarum(20,20);
        System.out.println(result);
        result =calculator.hanum(20,4);
        System.out.println(result);
        result =calculator.bajanum(20,5);
        System.out.println(result);
        result = calculator.bazmapatkum(30,2);
        System.out.println(result);

    }
}
