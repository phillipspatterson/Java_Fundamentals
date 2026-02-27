package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class Motorcycle implements Vehicle {
    @Override
    public void accelerate(int mph) {
        System.out.println("Motorcycle accelerating by spinning throttle");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("Motorcycle decelerating by squeezing hand brake");
    }

    @Override
    public void start() {
        System.out.println("Start by kickstart");
    }

    @Override
    public void stop() {
        System.out.println("Stop by turning off key");
    }
}
