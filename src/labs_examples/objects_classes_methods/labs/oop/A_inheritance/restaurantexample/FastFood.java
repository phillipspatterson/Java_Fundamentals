package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class FastFood extends Restaurant {
    private boolean hasDriveThrough;
    private int averageWaitTimeMinutes;

    public FastFood(){
        super();
        this.hasDriveThrough = false;
        this.averageWaitTimeMinutes = 10;
    }

    public FastFood(String name, String address, int yearEstablished, double averageRating, boolean hasDriveThrough, int averageWaitTimeMinutes){
        super(name, address, yearEstablished, averageRating);
        this.hasDriveThrough = hasDriveThrough;
        this.averageWaitTimeMinutes = averageWaitTimeMinutes;
    }

    @Override
    public String getServiceStyle() {
        return "Counter service - order at register, pick up at counter";
    }

    @Override
    public String describe(){
        return super.describe()
                + " | Drive-Through: " + (hasDriveThrough ? "Yes" : "No")
                + " | Avg Wait: " + averageWaitTimeMinutes + " min";
    }

    @Override
    public double calculateAverageMealCost() {
        return 10.00;
    }

    public String getQuickOrderInfo(){
        return "Order at " + getName() + " - Est. wait: " + averageWaitTimeMinutes + " minutes";
    }

    public boolean isHasDriveThrough() {
        return hasDriveThrough;
    }

    public void setHasDriveThrough(boolean hasDriveThrough) {
        this.hasDriveThrough = hasDriveThrough;
    }

    public int getAverageWaitTimeMinutes() {
        return averageWaitTimeMinutes;
    }

    public void setAverageWaitTimeMinutes(int averageWaitTimeMinutes) {
        this.averageWaitTimeMinutes = averageWaitTimeMinutes;
    }
}
