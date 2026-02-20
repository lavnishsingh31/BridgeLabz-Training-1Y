
import java.util.Scanner;

public class Solution7 {
    public static String manualTrim(String text) {
        int start = 0, end = text.length() - 1;
        
        while (start < text.length() && text.charAt(start) == ' ') start++;
        while (end >= 0 && text.charAt(end) == ' ') end--;
        
        if (start > end) return "";
        return text.substring(start, end + 1);
    }
    
    public static boolean compareStrings(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        // Solution 7: Trim String
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text (with spaces): ");
        String text = sc.nextLine();
        
        String userTrim = manualTrim(text);
        String builtInTrim = text.trim();
        
        System.out.println("User Trim: '" + userTrim + "'");
        System.out.println("Built-in Trim: '" + builtInTrim + "'");
        System.out.println("Match: " + compareStrings(userTrim, builtInTrim));
        sc.close();
    }
}
