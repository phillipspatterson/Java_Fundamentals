package labs_examples.objects_classes_methods.labs.objects;

//create first class
public class Subdivision {
    //create main()
    public static void main(String[] args) {
    //create 3 objects each using a different constructor
        House h1 = new House(1000.00, 5000.00);
        House h2 = new House(3);
        House h3 = new House("Brick");
    }
}

//create second class
//this is a POJO
class House{
    private double length;
    private double width;
    private int floors;
    private String siding;

    //demonstrate 3 overloaded constructors
    public House(double length, double width){
        this.length = length;
        this.width = width;
    }

    public House(int floors){
        this.floors = floors;
    }

    public House(String siding){
        this.siding = siding;
    }
}


