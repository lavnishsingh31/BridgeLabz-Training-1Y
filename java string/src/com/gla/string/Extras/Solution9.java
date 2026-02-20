
import java.util.Scanner;

public class Solution9 {
    public static void main(String[] args) {
        // Problem 9: Find the Most Frequent Character
        // Write a Java program to find the most frequent character in a string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        int[] freq = new int[256];
        for (char c : str.toCharArray()) {
            freq[c]++;
        }
        
        char mostFreqChar = ' ';
        int maxFreq = -1;
        
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mostFreqChar = (char) i;
            }
        }
        
        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
        scanner.close();
    }
}
