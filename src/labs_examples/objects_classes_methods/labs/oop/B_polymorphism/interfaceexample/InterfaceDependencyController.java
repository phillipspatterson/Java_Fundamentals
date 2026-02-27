package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class InterfaceDependencyController {
    public static void main(String[] args) {

        EmailSender email = new EmailSender();
        AlertSystem alert = new AlertSystem(email);
        alert.triggerAlert("phillip", "Server is down!");


        SMSSender sms = new SMSSender();
        alert.setSender(sms);
        alert.triggerAlert("phillip", "Server is down!");

        MicrosoftTeamsSender teams = new MicrosoftTeamsSender();
        alert.setSender(teams);
        alert.triggerAlert("phillip", "Server is down!");
    }
}
