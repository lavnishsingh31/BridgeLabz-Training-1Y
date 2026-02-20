
import java.util.Scanner;

public class Solution6 {
    public static String getType(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return "Vowel";
        else if (ch >= 'a' && ch <= 'z') return "Consonant";
        else return "Not a Letter";
    }
    
    public static String[][] analyzeCharacters(String text) {
        String[][] analysis = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            analysis[i][0] = String.valueOf(ch);
            analysis[i][1] = getType(ch);
        }
        return analysis;
    }

    public static void main(String[] args) {
        // Solution 6: Character Analysis Table
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[][] analysis = analyzeCharacters(text);
        
        System.out.println("Char\tType");
        for (String[] row : analysis) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
