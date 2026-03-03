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
        player1.potValue = 100;

        Player player2 = new Player();
        player2.name = "Computer";
        player2.potValue = 100;

        while (player1.potValue > 0 && player2.potValue > 0) {

            player1.hand = new Hand();
            player2.hand = new Hand();

            Deck deck = new Deck();
            deck.deal(player1);
            deck.deal(player2);
            deck.deal(player1);
            deck.deal(player2);

            System.out.println("You have $" + player1.potValue);
            System.out.println("How much do you want to bet? (in $50 increments)");
            int bet = scanner.nextInt();
            scanner.nextLine();

            while (bet > player1.potValue || bet <= 0 || bet % 50 != 0) {
                System.out.println("Invalid bet. Must be in $50 increments. You have $" + player1.potValue);
                bet = scanner.nextInt();
                scanner.nextLine();
            }

            System.out.println("Your cards:");
            player1.hand.printHand();
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
                        player1.hand.printHand();
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
            player1.hand.printHand();
            System.out.println("Hand value: " + player1.hand.calculateScore());

            System.out.println(player2.name + "'s cards:");
            player2.hand.printHand();
            System.out.println("Hand value: " + player2.hand.calculateScore());

            if (player1.hand.isOver21() && player2.hand.isOver21()) {
                System.out.println("Both lost");
                player1.potValue -= bet;
                player2.potValue -= bet;
            } else if (player1.hand.isOver21()) {
                System.out.println("Computer Won");
                player1.potValue -= bet;
                player2.potValue += bet;
            } else if (player2.hand.isOver21()) {
                System.out.println(player1.name + " Won");
                player1.potValue += bet;
                player2.potValue -= bet;
            } else if (player1.hand.calculateScore() > player2.hand.calculateScore()) {
                System.out.println(player1.name + " Won");
                player1.potValue += bet;
                player2.potValue -= bet;
            } else if (player2.hand.calculateScore() > player1.hand.calculateScore()) {
                System.out.println("Computer Won");
                player1.potValue -= bet;
                player2.potValue += bet;
            } else {
                System.out.println("Tie - no money lost");
            }
            System.out.println(player1.name + " has $" + player1.potValue);
            System.out.println("Computer has $" + player2.potValue);
        }
        System.out.println("Game over!");
    }
}
