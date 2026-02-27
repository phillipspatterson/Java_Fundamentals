package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample;

public class Laptop implements Chargeable {
    @Override
    public void charge(){
        System.out.println("Connecting power adapter");
    }
    @Override
    public int getBatteryLevel(){
        return 25;
    }
}
