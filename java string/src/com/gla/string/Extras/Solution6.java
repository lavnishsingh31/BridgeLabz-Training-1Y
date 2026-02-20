
import java.util.Scanner;

public class Solution6 {
    public static void main(String[] args) {
        // Problem 6: Find Substring Occurrences
        // Write a Java program to count how many times a given substring occurs in a string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main string: ");
        String str = scanner.nextLine();
        System.out.print("Enter substring: ");
        String sub = scanner.nextLine();
        
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        
        System.out.println("Occurrences: " + count);
        scanner.close();
    }
}
