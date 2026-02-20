
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // Problem 5: Palindrome Checker
        // Check if string is palindrome using functions.

        String input = getInput();
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
    
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }
    
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", "").toLowerCase();
        StringBuilder reversed = new StringBuilder(cleanStr).reverse();
        return cleanStr.equals(reversed.toString());
    }
}
