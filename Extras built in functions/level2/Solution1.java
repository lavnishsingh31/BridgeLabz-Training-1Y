
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        // Problem 1: Number Guessing Game
        // Write a Java program where the user thinks of a number between 1 and 100, 
        // and the computer tries to guess the number.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it.");
        
        int low = 1;
        int high = 100;
        String feedback = "";
        
        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = getGuess(low, high);
            System.out.println("Is it " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine();
            
            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            } else if (!feedback.equalsIgnoreCase("correct")) {
                System.out.println("Please enter 'high', 'low', or 'correct'.");
            }
        }
        
        System.out.println("Yay! I guessed it.");
        scanner.close();
    }
    
    public static int getGuess(int low, int high) {
        return low + (int)(Math.random() * ((high - low) + 1));
    }
}
