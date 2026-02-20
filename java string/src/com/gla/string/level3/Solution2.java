
import java.util.Scanner;

public class Solution2 {
    public static char[] findUniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count++] = currentChar;
            }
        }
        
        char[] result = new char[count];
        System.arraycopy(unique, 0, result, 0, count);
        return result;
    }

    public static void main(String[] args) {
        // Solution 2: Unique Characters
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique Characters: ");
        for (char c : unique) {
            System.out.print(c + " ");
        }
        System.out.println();
        sc.close();
    }
}
