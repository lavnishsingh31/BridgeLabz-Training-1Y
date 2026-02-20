
import java.util.Scanner;

public class Solution8 {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10; // Random age 10-99
        }
        return ages;
    }
    
    public static String[][] checkVoting(int[] ages) {
        String[][] results = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            results[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return results;
    }

    public static void main(String[] args) {
        // Solution 8: Student Voting
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[] ages = generateAges(n);
        String[][] results = checkVoting(ages);
        
        System.out.println("Age\tCoting Status");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
