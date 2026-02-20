
import java.util.Scanner;

public class Solution10 {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            scores[i][0] = 50 + (int)(Math.random() * 51); // Physics
            scores[i][1] = 50 + (int)(Math.random() * 51); // Chem
            scores[i][2] = 50 + (int)(Math.random() * 51); // Math
        }
        return scores;
    }
    
    public static String calculateGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    public static void main(String[] args) {
        // Solution 10: Student Grading
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] scores = generateScores(n);
        
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int[] s : scores) {
            int total = s[0] + s[1] + s[2];
            double avg = total / 3.0;
            double perc = total / 300.0 * 100;
            String grade = calculateGrade(perc);
            
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%s\n", s[0], s[1], s[2], total, avg, perc, grade);
        }
        sc.close();
    }
}
