package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.interfaceexample;

public class InterfaceDependencyController {
    public static void main(String[] args) {

        AlertSystem alert = new AlertSystem(new EmailSender());
        alert.triggerAlert("phillip", "Server is down!");

        alert.setSender(new SMSSender());
        alert.triggerAlert("phillip", "Server is down!");
    }
}
