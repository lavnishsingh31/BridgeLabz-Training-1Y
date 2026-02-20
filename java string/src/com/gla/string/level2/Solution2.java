
import java.util.Scanner;
import java.util.Arrays;

public class Solution2 {
    public static String[] splitText(String text) {
        // Simple logic: Assuming space is delimiter.
        // First count words
        int wordCount = 0;
        // Trim to handle edges
        String temp = text.trim();
        if (temp.isEmpty()) return new String[0];
        
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ' && (i + 1 < temp.length() && temp.charAt(i + 1) != ' ')) {
                wordCount++;
            }
        }
        wordCount++; // For the last word
        
        String[] words = new String[wordCount];
        int index = 0;
        String currentWord = "";
        
        for (int i = 0; i < temp.length(); i++) {
            if (temp.charAt(i) == ' ') {
                if (!currentWord.isEmpty()) {
                    words[index++] = currentWord;
                    currentWord = "";
                }
            } else {
                currentWord += temp.charAt(i);
            }
        }
        if (!currentWord.isEmpty()) words[index] = currentWord;
        
        return words;
    }
    
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        // Solution 2: Split String
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] userSplit = splitText(text);
        String[] builtInSplit = text.trim().split("\\s+"); // Regex for whitespace to match logic roughly
        // Note: Manual split usually handles single spaces. Built-in split " " handles single.
        // My logic handles multiple spaces by checking empty word.
        // Let's stick to standard behavior comparison.
        
        System.out.println("User Split: " + Arrays.toString(userSplit));
        System.out.println("Built-in Split: " + Arrays.toString(builtInSplit));
        System.out.println("Compare: " + compareArrays(userSplit, builtInSplit));
        sc.close();
    }
}
