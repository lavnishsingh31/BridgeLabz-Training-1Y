
import java.util.Scanner;

public class Solution6 {
    public static void findFrequency(String text) {
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];
        
        // Initialize freq array with -1
        for(int i=0; i<freq.length; i++) freq[i] = -1;
        
        for (int i = 0; i < chars.length; i++) {
            int count = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    freq[j] = 0; // Mark as visited
                }
            }
            if (freq[i] != 0) {
                freq[i] = count;
            }
        }
        
        System.out.println("Char\tFrequency");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0) {
                System.out.println(chars[i] + "\t" + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        // Solution 6: Frequency using Nested Loops
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        findFrequency(text);
        sc.close();
    }
}
