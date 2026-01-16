package labs_examples.objects_classes_methods.Demo;
//this is the blueprint
public class Dog {
    String color;
    String breed;
    String name;
    private int numberOfPaws;

    public void bark() {
        System.out.println(name + " says: woof!");
    }

    public void fetch(String item) {
        System.out.println(name + " is fetching " + item);
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public void setNumberOfPaws(int numberOfPaws) {
        if (numberOfPaws < 6) {
            this.numberOfPaws = numberOfPaws;
        }else {
            System.out.println("Invalid number of paws");
        }
    }
}
