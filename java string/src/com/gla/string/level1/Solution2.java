
import java.util.Scanner;

public class Solution2 {
    public static String createSubstring(String text, int start, int end) {
        String sub = "";
        for (int i = start; i < end; i++) {
            sub += text.charAt(i);
        }
        return sub;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 2: Substring
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        String userSub = createSubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        
        System.out.println("User Substring: " + userSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Comparison: " + compareStrings(userSub, builtInSub));
        sc.close();
    }
}
