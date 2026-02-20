
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // Problem 1: Count Vowels and Consonants
        // Write a Java program to count the number of vowels and consonants in a given string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine().toLowerCase();
        
        int vowels = 0, consonants = 0;
        
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        scanner.close();
    }
}
