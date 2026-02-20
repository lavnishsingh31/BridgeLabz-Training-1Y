
import java.util.Scanner;

public class Solution10 {
    public static String[] initializeDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int n = suits.length * ranks.length;
        String[] deck = new String[n];
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = ranks[i] + " of " + suits[j];
            }
        }
        return deck;
    }
    
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
        return deck;
    }
    
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards.");
            return null;
        }
        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIdx = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[cardIdx++];
            }
        }
        return players;
    }

    public static void main(String[] args) {
        // Solution 10: Deck of Cards
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int cardsFn = sc.nextInt();
        
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);
        
        String[][] distribution = distributeCards(deck, players, cardsFn);
        if (distribution != null) {
            for (int i = 0; i < players; i++) {
                System.out.println("\nPlayer " + (i + 1) + " cards:");
                for (int j = 0; j < cardsFn; j++) {
                    System.out.println(distribution[i][j]);
                }
            }
        }
        sc.close();
    }
}
