package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class StandardVehicle implements Vehicle {
    @Override
    public void accelerate(int mph) {
        System.out.println("Standard Vehicle accelerating by pressing gas pedal");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("Standard Vehicle decelerating by pressing brake pedal");
    }

    @Override
    public void start() {
        System.out.println("Standard Vehicle starting by turning key");
    }

    @Override
    public void stop() {
        System.out.println("Standard Vehicle stopped by turning key");
    }
}
