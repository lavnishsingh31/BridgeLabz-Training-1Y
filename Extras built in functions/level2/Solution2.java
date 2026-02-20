
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        // Problem 2: Maximum of Three Numbers
        // Write a program that takes three integer inputs from the user and finds the
        // maximum of the three numbers using modular functions.

        int[] numbers = getThreeNumbers();
        int max = findMaximum(numbers[0], numbers[1], numbers[2]);
        System.out.println("The maximum number is: " + max);
    }
    
    public static int[] getThreeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[3];
        System.out.print("Enter first number: ");
        nums[0] = scanner.nextInt();
        System.out.print("Enter second number: ");
        nums[1] = scanner.nextInt();
        System.out.print("Enter third number: ");
        nums[2] = scanner.nextInt();
        return nums;
    }
    
    public static int findMaximum(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        return c;
    }
}
