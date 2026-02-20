
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        // Problem 7: Toggle Case of Characters
        // Write a Java program to toggle the case of each character in a given string.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        StringBuilder toggled = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                toggled.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                toggled.append(Character.toUpperCase(c));
            } else {
                toggled.append(c);
            }
        }
        
        System.out.println("Toggled Case String: " + toggled);
        scanner.close();
    }
}
