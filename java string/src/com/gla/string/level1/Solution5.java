
import java.util.Scanner;

public class Solution5 {
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Throws Exception
    }
    
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e);
        }
    }

    public static void main(String[] args) {
        // Solution 5: StringIndexOutOfBoundsException Demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        
        System.out.println("Generating Exception...");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught in main: " + e);
        }
        
        System.out.println("\nHandling Exception...");
        handleException(text);
        sc.close();
    }
}
