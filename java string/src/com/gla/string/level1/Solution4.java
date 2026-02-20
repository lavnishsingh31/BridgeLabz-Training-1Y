
public class Solution4 {
    public static void generateException() {
        String text = null;
        System.out.println(text.length()); // This will throw exception
    }
    
    public static void handleException() {
        String text = null;
        try {
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e);
        }
    }

    public static void main(String[] args) {
        // Solution 4: NullPointerException Demo
        System.out.println("Generating Exception...");
        try {
            generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e);
        }
        
        System.out.println("\nHandling Exception...");
        handleException();
    }
}
