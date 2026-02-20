
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        // Problem 10: Remove a Specific Character from a String
        // Write a Java program to remove all occurrences of a specific character from a string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char removeChar = scanner.next().charAt(0);
        
        String result = str.replace(String.valueOf(removeChar), "");
        
        System.out.println("Modified String: " + result);
        scanner.close();
    }
}
