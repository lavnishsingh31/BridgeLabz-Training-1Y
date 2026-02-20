
import java.util.Scanner;

public class Solution7 {
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println("Parsed number: " + num);
    }
    
    public static void handleException(String text) {
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Solution 7: NumberFormatException Demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter non-numeric string: ");
        String text = sc.next();
        
        System.out.println("Handling Exception...");
        handleException(text);
        sc.close();
    }
}
