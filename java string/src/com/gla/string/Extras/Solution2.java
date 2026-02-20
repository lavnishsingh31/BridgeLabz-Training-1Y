
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        // Problem 2: Reverse a String
        // Write a Java program to reverse a given string without using any built-in reverse functions.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        System.out.println("Reversed String: " + reversed);
        scanner.close();
    }
}
