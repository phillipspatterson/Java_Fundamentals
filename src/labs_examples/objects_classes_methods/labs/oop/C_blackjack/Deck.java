package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

    public Card[] cards = new Card[52];
    public ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck(){
        char[] suits = new char[]{'♠', '♦', '♥', '♣'};
        int count = 0;
        for(int i = 0; i < suits.length; i++){
            for (int j = 1; j <= 13; j++){
                Card newCard = new Card();
                newCard.cardValue = j;
                newCard.cardSuit = suits[i];
                cards[count] = newCard;
                count++;
            }
        }
    }

    public void deal(Player player) {
        Random random = new Random();
        int randomNum;
        do {
            randomNum = random.nextInt(52);
        } while (usedCards.contains(randomNum));
        player.hand.cards.add(cards[randomNum]);
        usedCards.add(randomNum);
    }
}
