
import java.util.StringTokenizer;

public class Problem1 {
    public static void parseAndDisplayContacts(String contactData) {
        StringTokenizer lineTokenizer = new StringTokenizer(contactData, "\n");
        int totalContacts = 0;
        
        while (lineTokenizer.hasMoreTokens()) {
            String contactLine = lineTokenizer.nextToken();
            StringTokenizer fieldTokenizer = new StringTokenizer(contactLine, ";");
            
            // Check if valid contact line (simple check for now)
            if (fieldTokenizer.countTokens() >= 4) {
                String name = fieldTokenizer.nextToken();
                String phone = fieldTokenizer.nextToken();
                String email = fieldTokenizer.nextToken();
                String address = fieldTokenizer.nextToken(); // May contain remaining part
                
                System.out.println("Contact " + (totalContacts + 1) + ":");
                System.out.println("Name   : " + name);
                System.out.println("Phone  : " + phone);
                System.out.println("Email  : " + email);
                System.out.println("Address: " + address);
                System.out.println("-------------------------");
                totalContacts++;
            }
        }
        System.out.println("Total contacts processed: " + totalContacts);
    }

    public static void main(String[] args) {
        // Problem 1: Contact Parser
        String input = "John Doe;+1-555-0101;john@email.com;123 Main St, NYC\n" +
                       "Jane Smith;+1-555-0102;jane@email.com;456 Oak Ave, LA\n" +
                       "Bob Jones;+1-555-0103;bob@email.com;789 Pine Rd, TX\n" +
                       "Alice Brown;+1-555-0104;alice@email.com;321 Elm St, FL\n" +
                       "Mike White;+1-555-0105;mike@email.com;654 Maple Dr, WA";
        
        parseAndDisplayContacts(input);
    }
}
