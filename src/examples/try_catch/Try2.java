package examples.try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.err.println("Error #404");
        } catch (InputMismatchException ex) {
            System.out.println();
        }
    }
}
