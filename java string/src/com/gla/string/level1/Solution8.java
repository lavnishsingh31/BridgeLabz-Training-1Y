
import java.util.Scanner;

public class Solution8 {
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Access out of bounds
    }
    
    public static void handleException(String[] names) {
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e);
        }
    }

    public static void main(String[] args) {
        // Solution 8: ArrayIndexOutOfBoundsException Demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        
        System.out.println("Handling Exception...");
        handleException(names);
        sc.close();
    }
}
