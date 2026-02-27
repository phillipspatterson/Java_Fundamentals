package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class Biplane extends Plane{

    @Override
    public void start() {
        System.out.println("biplane starting by spinning propellor manually");
    }

    @Override
    public void stop() {
        System.out.println("biplane stopping");
    }
}
