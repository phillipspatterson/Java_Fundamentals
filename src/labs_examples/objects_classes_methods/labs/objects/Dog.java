package labs_examples.objects_classes_methods.labs.objects;

public class Dog {
    private String breed;
    private String color;
    private int age;
    private boolean isNeutered;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!color.equalsIgnoreCase("Pink"))
            this.color = color;
        else {
            System.out.println("invalid dog color");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public void bark(){
        System.out.println("The " + color + " " + breed + " is barking");
    }

    public void fetch(){
        System.out.println("The " + color + " " + breed + " is fetching");
    }

    public void play(){
        System.out.println("The " + color + " " + breed + " is playing");
    }
}
