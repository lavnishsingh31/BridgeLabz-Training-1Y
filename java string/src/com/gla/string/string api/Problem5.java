
import java.util.StringTokenizer;

public class Problem5 {
    private static StringBuffer chatHistory = new StringBuffer();
    
    // Part A: Parsing
    public static void analyzeMessage(String message) {
        StringTokenizer st = new StringTokenizer(message);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) {
                // Mention
            } else if (token.startsWith("#")) {
                // Hashtag
            } else if (token.startsWith("/")) {
                // Command
            }
        }
    }
    
    // Part B: Formatting
    public static String formatMessage(String user, String message) {
        StringBuilder formatted = new StringBuilder();
        String timestamp = java.time.LocalTime.now().toString().substring(0, 8); // HH:mm:ss
        formatted.append("[").append(timestamp).append("] ").append(user).append(": ");
        
        StringTokenizer st = new StringTokenizer(message);
        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (token.startsWith("@")) {
                formatted.append("**").append(token).append("** ");
            } else if (token.startsWith("#")) {
                formatted.append("*").append(token).append("* ");
            } else if (token.startsWith("/")) {
                formatted.append("[CMD: ").append(token.substring(1)).append("] ");
            } else {
                formatted.append(token).append(" ");
            }
        }
        return formatted.toString().trim();
    }
    
    // Part C: Thread-safe History
    public static synchronized void addMessageToHistory(String formattedMessage) {
        chatHistory.append(formattedMessage).append("\n");
    }

    public static void main(String[] args) {
        // Simulating chat
        String[] users = {"Alice", "Bob", "Charlie"};
        String[] messages = {
            "Hey @Bob, check out #JavaTutorial",
            "@Alice thanks! Using #SpringBoot now",
            "/help - how do I join #JavaTutorial?"
        };
        
        for (int i = 0; i < messages.length; i++) {
            String user = users[i % users.length]; // Round robin
            String formatted = formatMessage(user, messages[i]);
            analyzeMessage(messages[i]); // Just calling for completeness
            addMessageToHistory(formatted);
        }
        
        System.out.println("Chat History:");
        System.out.println(chatHistory.toString());
        
        // Analytics would require state tracking in class, simplified here.
    }
}
