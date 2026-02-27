package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample2;

public class Circle extends Shape{
    public double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
