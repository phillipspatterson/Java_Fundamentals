package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {

    public String name;
    public Hand hand;
    public int potValue;

    public boolean computerAI(){
        return hand.calculateScore() < 16;
    }
}
