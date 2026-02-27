package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Hand {

    public ArrayList<Card> cards;
    public int handValue;

    public Hand() {
        cards = new ArrayList<>();
    }

    public int calculateScore(){
        //variable to hold running total
        int total = 0;
        //loop through every card in array list
        for (Card card : cards) {
            //for each card figure out score
            //add them all
            if (card.cardValue > 10) {
                total += 10;
            } else {
                total += card.cardValue;
            }
        }
            //return total
        return total;
    }

    public boolean isOver21(){
        return calculateScore() > 21;
    }

}
