
import java.time.LocalDate;
import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        // Problem 4: Date Comparison
        // Write a program that:
        // - Takes two date inputs and compares them to check if the first date is before,
        //   after, or the same as the second date.

        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter first date (yyyy-MM-dd): ");
            String dateString1 = scanner.nextLine();
            LocalDate date1 = LocalDate.parse(dateString1);

            System.out.print("Enter second date (yyyy-MM-dd): ");
            String dateString2 = scanner.nextLine();
            LocalDate date2 = LocalDate.parse(dateString2);

            if (date1.isBefore(date2)) {
                System.out.println(date1 + " is before " + date2);
            } else if (date1.isAfter(date2)) {
                System.out.println(date1 + " is after " + date2);
            } else if (date1.equals(date2)) { // isEqual() works too
                System.out.println(date1 + " is the same as " + date2);
            }

        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            scanner.close();
        }
    }
}
