package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample;

public class Phone implements Chargeable {
    @Override
    public void charge(){
        System.out.println("Plugging in USB-C cable");
    }
    @Override
    public int getBatteryLevel(){
        return 10;
    }
}
