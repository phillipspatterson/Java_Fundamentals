package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample2;

public class Invoice implements Printable{
    @Override
    public void printInfo(){
        System.out.println("Invoice #0001 - $2,500.50");
    }
}
