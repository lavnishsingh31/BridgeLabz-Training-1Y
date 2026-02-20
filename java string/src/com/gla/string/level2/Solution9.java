
import java.util.Scanner;

public class Solution9 {
    public static String getComputerChoice() {
        int choice = (int) (Math.random() * 3);
        if (choice == 0) return "Rock";
        else if (choice == 1) return "Paper";
        else return "Scissors";
    }
    
    public static String getWinner(String user, String computer) {
        if (user.equalsIgnoreCase(computer)) return "Draw";
        if ((user.equalsIgnoreCase("Rock") && computer.equals("Scissors")) ||
            (user.equalsIgnoreCase("Paper") && computer.equals("Rock")) ||
            (user.equalsIgnoreCase("Scissors") && computer.equals("Paper"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        // Solution 9: Rock Paper Scissors Game
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        
        int userWins = 0, compWins = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.print("\nGame " + (i+1) + ": Enter Rock, Paper, or Scissors: ");
            String user = sc.next();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            
            System.out.println("Computer chose: " + comp);
            System.out.println("Winner: " + winner);
            
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }
        
        System.out.println("\nStats:");
        System.out.println("User Wins: " + userWins + " (" + (double)userWins/n*100 + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + (double)compWins/n*100 + "%)");
        sc.close();
    }
}
