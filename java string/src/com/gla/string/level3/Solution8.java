
import java.util.Scanner;
import java.util.Arrays;

public class Solution8 {
    public static boolean isAnagram(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();
        
        // Sorting approach or Frequency array approach. Hint says compare frequency.
        // Let's use frequency array.
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i)]++;
            freq2[text2.charAt(i)]++;
        }
        
        for (int i = 0; i < 256; i++) {
            if (freq1[i] != freq2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 8: Anagram Check
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();
        
        if (isAnagram(text1, text2)) {
            System.out.println("Texts are Anagrams.");
        } else {
            System.out.println("Texts are Not Anagrams.");
        }
        sc.close();
    }
}
