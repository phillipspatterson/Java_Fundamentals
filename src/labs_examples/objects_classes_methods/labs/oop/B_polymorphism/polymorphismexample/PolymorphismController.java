package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample;

import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.animalexample.Animal;
import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.animalexample.Cat;
import labs_examples.objects_classes_methods.labs.oop.B_polymorphism.animalexample.Dog;

public class PolymorphismController {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print("Hi");
        p.print(4);
        p.print("Phillip", "My name is");

        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.speak();;
        cat.speak();

        Chargeable iPhone = new Phone();
        Chargeable macBook = new Laptop();

        Chargeable[] devices = {iPhone, macBook};
        for (Chargeable device : devices) {
            device.charge();
            System.out.println("Battery: " + device.getBatteryLevel() + "%");
        }

    }
}
