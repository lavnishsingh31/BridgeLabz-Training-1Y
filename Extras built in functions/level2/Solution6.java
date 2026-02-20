
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        // Problem 6: Factorial Using Recursion
        // Calculate factorial using recursion and modular code.

        int number = getInput();
        long fact = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + fact);
    }
    
    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }
    
    public static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }
}
