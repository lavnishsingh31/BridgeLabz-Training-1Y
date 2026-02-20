
import java.util.Scanner;

public class Solution3 {
    public static String[][] splitWordsWithLength(String text) {
        String[] words = text.trim().split("\\s+");
        String[][] result = new String[words.length][2];
        
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        // Solution 3: Words and Lengths
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[][] results = splitWordsWithLength(text);
        
        System.out.println("Word\tLength");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
