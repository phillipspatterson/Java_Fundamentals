package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class Car implements Vehicle {

    @Override
    public void accelerate(int mph) {
        System.out.println("Car accelerating by pressing gas pedal");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("Car decelerating by pressing brake pedal");
    }

    @Override
    public void start() {
        System.out.println("Car starting by turning key");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped by turning key");
    }
}
