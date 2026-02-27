package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class MicrosoftTeamsSender implements MessageSender{
    @Override
    public void send(String recipient, String message){
        System.out.println("  TEAMS to " + recipient + ": " + message);
    }
}
