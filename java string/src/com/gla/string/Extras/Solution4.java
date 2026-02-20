
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        // Problem 4: Remove Duplicates from a String
        // Write a Java program to remove all duplicate characters from a given string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (result.indexOf(c) == -1) {
                result += c;
            }
        }
        
        System.out.println("String after removing duplicates: " + result);
        scanner.close();
    }
}
