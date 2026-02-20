
import java.util.Scanner;

public class Solution1 {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        // Solution 1: String Length without length()
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        
        System.out.println("Length (User defined): " + findLength(text));
        System.out.println("Length (Built-in): " + text.length());
        sc.close();
    }
}
