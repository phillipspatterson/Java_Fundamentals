package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public abstract class Restaurant {
    private String name;
    private String address;
    private int yearEstablished;
    private double averageRating;

    public Restaurant(){
        this.name = "Unknown";
        this.address = "Unknown";
        this.yearEstablished = 2000;
        this.averageRating = 3.5;
    }

    public Restaurant(String name, String address, int yearEstablished, double averageRating) {
        this.name = name;
        this.address = address;
        this.yearEstablished = yearEstablished;
        this.averageRating = averageRating;
    }

    public abstract String getServiceStyle();

    public String describe() {
        return name + " located at " + address + " (Est. " + yearEstablished
                + ") - Rating: " + averageRating + "/5.0";
    }

    public double calculateAverageMealCost(){
        return 16.99;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearEstablished() {
        return yearEstablished;
    }

    public void setYearEstablished(int yearEstablished) {
        this.yearEstablished = yearEstablished;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

}
