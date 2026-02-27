package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample2;

public class PolymorphismController2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,3));
        System.out.println(calculator.add(10,20,30));
        System.out.println(calculator.add(150.50, 333.55));

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2.0, 4.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        Printable invoice = new Invoice();
        Printable contact = new ContactInfo();
        invoice.printInfo();
        contact.printInfo();
    }
}
