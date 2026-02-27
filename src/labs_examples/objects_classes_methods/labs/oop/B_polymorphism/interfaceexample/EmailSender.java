package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class EmailSender implements MessageSender{
    @Override
    public void send(String recipient, String message){
        System.out.println("  EMAIL to " + recipient + ": " + message);
    }
}
