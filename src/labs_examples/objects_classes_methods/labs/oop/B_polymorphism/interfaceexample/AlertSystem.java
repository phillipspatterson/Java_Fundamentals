package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class AlertSystem {

    private MessageSender sender;

    public AlertSystem(MessageSender sender) {
        this.sender = sender;
    }

    public void setSender(MessageSender sender) {
        this.sender = sender;
    }

    public void triggerAlert(String recipient, String message) {
        System.out.println("  Alert triggered!");
        sender.send(recipient, message);
    }
}
