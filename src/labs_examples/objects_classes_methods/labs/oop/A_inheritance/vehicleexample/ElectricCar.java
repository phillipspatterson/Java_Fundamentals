package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class ElectricCar extends Car{
    int currentCharge;

    public void charge(){
        System.out.println("Charging electric car");
    }

    @Override
    public void start() {
        System.out.println("Electric car starting by pushing start button");
    }
}
