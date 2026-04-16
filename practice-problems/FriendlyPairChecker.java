import java.util.Scanner;

public class FriendlyPairChecker {
    // Calculate sum of proper divisors (excluding number itself)
    public static int sumOfProperDivisors(int num) {
        int sum = 1; // 1 is always a proper divisor
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i && num / i != num) {
                    sum += num / i;
                }
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Calculate abundancy for both numbers
        double abundancy1 = (double) sumOfProperDivisors(num1) / num1;
        double abundancy2 = (double) sumOfProperDivisors(num2) / num2;
        
        // Check if they form a friendly pair
        if (Math.abs(abundancy1 - abundancy2) < 0.0001) {
            System.out.println("Yes, they are a friendly pair");
        } else {
            System.out.println("No, they are not a friendly pair");
        }
        
        sc.close();
    }
}