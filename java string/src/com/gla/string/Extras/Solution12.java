
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        // Problem 12: Replace Word
        // Write a replace method in Java that replaces a given word with another word in a sentence.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String target = scanner.next();
        System.out.print("Enter replacement word: ");
        String replacement = scanner.next();
        
        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + modifiedSentence);
        scanner.close();
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        // Using replaceAll with word boundaries to ensure we replace whole words only
        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }
}
