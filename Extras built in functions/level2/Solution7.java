
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        // Problem 7: GCD and LCM Calculator
        // Calculate GCD and LCM using separate functions.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("GCD: " + calculateGCD(num1, num2));
        System.out.println("LCM: " + calculateLCM(num1, num2));
        scanner.close();
    }
    
    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public static int calculateLCM(int a, int b) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / calculateGCD(a, b);
    }
}
