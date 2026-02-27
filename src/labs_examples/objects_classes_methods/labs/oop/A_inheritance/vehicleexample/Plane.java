package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public abstract class Plane implements Vehicle{

    @Override
    public void accelerate(int mph) {
        System.out.println("plane accelerating");
    }

    @Override
    public void decelerate(int mph) {
        System.out.println("plane decelerating");
    }
}
