import java.util.Random;

public class Deck {

    public static void initializeDeck(String[] deck, String[] suits, String[] rank) {

        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }
    }

    public static void shuffleDeck(String[] deck, int numberOfCards, Random random) {
        for (int i = 0; i < numberOfCards; i++) {
            int card = i + (random.nextInt(numberOfCards - i)); // random card in the deck
            String temp = deck[card];
            deck[card] = deck[i];
            deck[i] = temp;
        }
    }

    public static void dealCards(String[] deck, int cardsForPlayer, int players) {
        for (int i = 0; i < players * cardsForPlayer; i++) {
            System.out.println(deck[i]);

            if (i % cardsForPlayer == cardsForPlayer - 1)
                System.out.println();
        }
    }
}