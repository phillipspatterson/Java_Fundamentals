package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    public String name;
    public Hand hand;
    public int potValue;
    public double startingAmount = 100.00;
    public int currentBet;
    public static int gamesWonByPlayer;
    public static int gamesWonByComputer;
    public static int gamesPlayed;


    public boolean computerAI(){
        return hand.calculateScore() < 16;
    }
}
