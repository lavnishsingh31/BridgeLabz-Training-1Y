
import java.util.Scanner;

public class Solution7 {
    public static boolean isPalindromeLogic1(String text) {
        int start = 0;
        int end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    
    public static boolean isPalindromeLogic2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeLogic2(text, start + 1, end - 1);
    }
    
    public static boolean isPalindromeLogic3(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 7: Palindrome Check
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        System.out.println("Logic 1: " + isPalindromeLogic1(text));
        System.out.println("Logic 2: " + isPalindromeLogic2(text, 0, text.length()-1));
        System.out.println("Logic 3: " + isPalindromeLogic3(text));
        sc.close();
    }
}
