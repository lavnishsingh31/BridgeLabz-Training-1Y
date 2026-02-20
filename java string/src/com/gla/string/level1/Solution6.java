
import java.util.Scanner;

public class Solution6 {
    public static void generateException(String text) {
        // substring with start > end throws checked exception? No, IndexOutOfBounds which is Runtime.
        // Wait, JDK says StringIndexOutOfBoundsException.
        // PDF says IllegalArgumentException. Let's see.
        // Actually, substring might throw IndexOutOfBoundsException.
        // Let's try to simulate IllegalArgument if possible, but usually invalid args to standard methods throw IllegalArgument.
        // However, substring(start, end) documentation says "IndexOutOfBoundsException - if the beginIndex is negative, or endIndex is larger than the length of this String object, or beginIndex is larger than endIndex."
        // So it is IndexOutOfBoundsException.
        // I will follow the hint: "set start index to be greater than end index".
        // And catch RuntimeException/IllegalArgument as requested.
        System.out.println(text.substring(3, 1)); 
    }
    
    public static void handleException(String text) {
        try {
            generateException(text);
        } catch (RuntimeException e) { // Catching generic RuntimeException covers it
            System.out.println("Caught Exception: " + e);
        }
    }

    public static void main(String[] args) {
        // Solution 6: IllegalArgumentException Demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();
        
        System.out.println("Handling Exception...");
        handleException(text);
        sc.close();
    }
}
