package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class Jet extends Plane{
    @Override
    public void start() {
        System.out.println("Jet starts by firing engine");
    }

    @Override
    public void stop() {
        System.out.println("jet stops");
    }
}
