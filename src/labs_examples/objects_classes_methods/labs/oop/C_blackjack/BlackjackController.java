package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
    public static void main(String[] args) {
        playBlackJack();
    }

    public static void playBlackJack(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        Player player1 = new Player();
        player1.name = name;
        player1.hand = new Hand();

        Player player2 = new Player();
        player2.name = "Computer";
        player2.hand = new Hand();

        Deck deck = new Deck();
        deck.deal(player1);
        deck.deal(player2);
        deck.deal(player1);
        deck.deal(player2);

        System.out.println("Your cards:");
        for (Card card : player1.hand.cards) {
            System.out.println(card.cardSuit + " " + card.cardValue);
        }
        System.out.println("Hand value: " + player1.hand.calculateScore());

        boolean playerWantsCard = true;
        boolean computerWantsCard = true;

        while (playerWantsCard || computerWantsCard){
            //players turn
            if (playerWantsCard){
                System.out.println("Do you want another card? Yes/No");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("yes")){
                    //player wants card
                    deck.deal(player1);
                    System.out.println("Your cards:");
                    for (Card card : player1.hand.cards) {
                        System.out.println(card.cardSuit + " " + card.cardValue);
                    }
                    System.out.println("Hand value: " + player1.hand.calculateScore());
                    if (player1.hand.isOver21()) {
                        System.out.println("You busted!");
                        playerWantsCard = false;
                    }
                } else {
                    //player doesn't want card
                    playerWantsCard = false;
                }
            }
            //computers turn
            if (computerWantsCard) {
                if (player2.computerAI()) {
                    // computer wants a card
                    deck.deal(player2);
                    System.out.println("Computer took a card.");
                } else {
                    // computer doesn't want a card
                    System.out.println("Computer stands.");
                    computerWantsCard = false;
                }
                // check for bust
                if (player2.hand.isOver21()) {
                    System.out.println("Computer busted!");
                    computerWantsCard = false;
                }
            }
        }

        System.out.println(player1.name + "'s cards:");
        for (Card card : player1.hand.cards) {
            System.out.println(card.cardSuit + " " + card.cardValue);
        }
        System.out.println("Hand value: " + player1.hand.calculateScore());

        System.out.println(player2.name + "'s cards:");
        for (Card card : player2.hand.cards) {
            System.out.println(card.cardSuit + " " + card.cardValue);
        }
        System.out.println("Hand value: " + player2.hand.calculateScore());

        if (player1.hand.isOver21() && player2.hand.isOver21()) {
            System.out.println("Both lost");
        } else if (player1.hand.isOver21()){
            System.out.println("Computer Wins");
        } else if (player2.hand.isOver21()) {
            System.out.println("Player Wins");
        } else if (player1.hand.calculateScore() > player2.hand.calculateScore()) {
            System.out.println("Player Wins");
        } else if (player2.hand.calculateScore() > player1.hand.calculateScore()) {
            System.out.println("Computer Wins");
        } else {
            System.out.println("Tie");
        }
    }
}
