
import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static char[] stringToCharArray(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Solution 3: To Char Array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        
        char[] userChars = stringToCharArray(text);
        char[] builtInChars = text.toCharArray();
        
        System.out.println("User Char Array: " + Arrays.toString(userChars));
        System.out.println("Built-in Char Array: " + Arrays.toString(builtInChars));
        System.out.println("Comparison: " + compareCharArrays(userChars, builtInChars));
        sc.close();
    }
}
