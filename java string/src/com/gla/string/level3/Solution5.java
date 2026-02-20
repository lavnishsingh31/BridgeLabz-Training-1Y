
import java.util.Scanner;

public class Solution5 {
    // Reusing logic from Q2 for unique chars
    public static char[] findUniqueCharacters(String text) {
        char[] temp = text.toCharArray();
        int n = temp.length;
        // Simple logic to find unique
        String unique = "";
        for (int i = 0; i < n; i++) {
            if (unique.indexOf(temp[i]) == -1) {
                unique += temp[i];
            }
        }
        return unique.toCharArray();
    }
    
    public static String[][] findFrequency(String text) {
        char[] unique = findUniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        
        for (int i = 0; i < unique.length; i++) {
            char u = unique[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == u) count++;
            }
            result[i][0] = String.valueOf(u);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void main(String[] args) {
        // Solution 5: Frequency using Unique Chars
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[][] freq = findFrequency(text);
        System.out.println("Char\tFrequency");
        for (String[] row : freq) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
