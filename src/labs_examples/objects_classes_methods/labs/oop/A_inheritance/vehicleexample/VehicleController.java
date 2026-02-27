package labs_examples.objects_classes_methods.labs.oop.A_inheritance.vehicleexample;

public class VehicleController {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        car.start();
        motorcycle.start();
        car.accelerate(10);
        motorcycle.accelerate(10);
        car.decelerate(5);
        motorcycle.decelerate(5);
        car.stop();
        motorcycle.stop();

        ElectricCar electricCar = new ElectricCar();
        electricCar.start();
        electricCar.accelerate(10);

        Biplane biplane = new Biplane();
        biplane.start();
        biplane.accelerate(50);
        biplane.stop();

        Jet jet = new Jet();
        jet.start();
        jet.accelerate(75);
        jet.stop();


    }
}
