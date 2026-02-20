
import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        // Problem 5: Find the Longest Word in a Sentence
        // Write a Java program that takes a sentence as input and returns the longest word.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.split("\\s+");
        String longestWord = "";
        
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        System.out.println("Longest Word: " + longestWord);
        scanner.close();
    }
}
