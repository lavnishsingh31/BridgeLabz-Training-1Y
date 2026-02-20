
import java.util.Scanner;

public class Solution10 {
    public static String convertToLowerCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }
        }
        return new String(chars);
    }
    
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 10: To Lower Case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        
        String userLower = convertToLowerCase(text);
        String builtInLower = text.toLowerCase();
        
        System.out.println("User Lower Case: " + userLower);
        System.out.println("Built-in Lower Case: " + builtInLower);
        System.out.println("Match: " + compareStrings(userLower, builtInLower));
        sc.close();
    }
}
