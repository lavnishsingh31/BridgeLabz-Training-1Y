
import java.util.Scanner;

public class Solution9 {
    public static String convertToUpperCase(String text) {
        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
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
        // Solution 9: To Upper Case
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.nextLine();
        
        String userUpper = convertToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        
        System.out.println("User Upper Case: " + userUpper);
        System.out.println("Built-in Upper Case: " + builtInUpper);
        System.out.println("Match: " + compareStrings(userUpper, builtInUpper));
        sc.close();
    }
}
