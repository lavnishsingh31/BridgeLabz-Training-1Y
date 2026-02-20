
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        // Problem 8: Temperature Converter
        // Convert between Fahrenheit and Celsius.

        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Celsius: " + fahrenheitToCelsius(f));
        } else if (choice == 2) {
            System.out.print("Enter Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Fahrenheit: " + celsiusToFahrenheit(c));
        } else {
            System.out.println("Invalid choice.");
        }
        scanner.close();
    }
    
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
