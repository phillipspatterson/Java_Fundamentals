package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class SMSSender implements MessageSender {
    @Override
    public void send(String recipient, String message){
        System.out.println("  SMS message to " + recipient + ": " + message);
    }
}
