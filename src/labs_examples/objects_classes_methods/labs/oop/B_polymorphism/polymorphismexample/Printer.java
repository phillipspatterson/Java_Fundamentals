package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample;

public class Printer {

    public void print(String text){
        System.out.println("text: " + text);
    }

    public void print(int number){
        System.out.println("Number: " + number);
    }

    public void print(String text, String prefix) {
        System.out.println(prefix + ": " + text);
    }
}
