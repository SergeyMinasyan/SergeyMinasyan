package arrayutil;

public class CandyTest {
    public static void main(String[] args) {
        Candy candy = new Candy();
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int maxofnumbers = candy.max(numbers);
        int[] numbers2 = {2, 3, 4, 8, 10};
        int maxofnumbers2 = candy.max(numbers2);
        if (maxofnumbers > maxofnumbers2) {
            System.out.println("Mecy arajini mejn e : ");
        } else {
            System.out.println("amenamecy erkrordi mej e : ");
        }
    }
}

