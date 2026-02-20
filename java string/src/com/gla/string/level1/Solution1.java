
import java.util.Scanner;

public class Solution1 {
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 1: Compare Strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.next();
        System.out.print("Enter second string: ");
        String s2 = sc.next();
        
        boolean isEqualUser = compareStrings(s1, s2);
        boolean isEqualBuiltIn = s1.equals(s2);
        
        System.out.println("User Defined Comparison: " + isEqualUser);
        System.out.println("Built-in Equals Comparison: " + isEqualBuiltIn);
        
        if (isEqualUser == isEqualBuiltIn) {
            System.out.println("Results match.");
        } else {
            System.out.println("Results do not match.");
        }
        sc.close();
    }
}
