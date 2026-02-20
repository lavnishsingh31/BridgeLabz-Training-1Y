
import java.time.LocalDate;
import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        // Problem 2: Date Arithmetic
        // Create a program that:
        // - Takes a date input and adds 7 days, 1 month, and 2 years to it.
        // - Then subtracts 3 weeks from the result.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String dateString = scanner.nextLine();
        
        try {
            LocalDate date = LocalDate.parse(dateString);
            
            LocalDate resultDate = date.plusDays(7)
                                       .plusMonths(1)
                                       .plusYears(2);
            
            resultDate = resultDate.minusWeeks(3);
            
            System.out.println("Original Date: " + date);
            System.out.println("Result Date: " + resultDate);
            
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
