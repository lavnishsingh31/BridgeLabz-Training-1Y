
import java.util.Scanner;

public class Solution8 {
    public static void main(String[] args) {
        // Problem 8: Compare Two Strings
        // Compare two strings lexicographically without built-in compareTo.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        int result = compareStrings(str1, str2);
        
        if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"");
        } else if (result > 0) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\"");
        } else {
            System.out.println("Both strings are equal.");
        }
        scanner.close();
    }
    
    public static int compareStrings(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();
        int limit = Math.min(len1, len2);
        
        for (int i = 0; i < limit; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (c1 != c2) {
                return c1 - c2;
            }
        }
        return len1 - len2;
    }
}
