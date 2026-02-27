package labs_examples.objects_classes_methods.labs.oop.B_polymorphism.polymorphismexample2;

public class Rectangle extends Shape{
    public double width;
    public double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea(){
        return width * height;
    }
}
