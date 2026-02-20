
import java.util.Scanner;

public class Solution4 {
    public static String[] findShortestLongest(String text) {
        String[] words = text.trim().split("\\s+");
        if (words.length == 0) return new String[]{"", ""};
        
        String shortest = words[0];
        String longest = words[0];
        
        for (String word : words) {
            if (word.length() < shortest.length()) shortest = word;
            if (word.length() > longest.length()) longest = word;
        }
        return new String[]{shortest, longest};
    }

    public static void main(String[] args) {
        // Solution 4: Shortest and Longest Strings
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        
        String[] result = findShortestLongest(text);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
        sc.close();
    }
}
