package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class DriveThrough extends FastFood {
    private int numberOfLanes;
    private boolean hasDigitalMenuBoard;
    private boolean is24Hours;

    public DriveThrough() {
        super();
        this.numberOfLanes = 2;
        this.hasDigitalMenuBoard = false;
        this.is24Hours = false;
    }

    public DriveThrough(String name,
                        String address,
                        int yearEstablished,
                        double averageRating,
                        boolean hasDriveThrough,
                        int averageWaitTimeMinutes,
                        int numberOfLanes,
                        boolean hasDigitalMenuBoard,
                        boolean is24Hours) {
        super(name, address, yearEstablished, averageRating,
                hasDriveThrough, averageWaitTimeMinutes);
        this.numberOfLanes = numberOfLanes;
        this.hasDigitalMenuBoard = hasDigitalMenuBoard;
        this.is24Hours = is24Hours;
    }

    @Override
    public String getServiceStyle() {
        return "Drive-through window service - order via speaker, pick up at window";
    }

    @Override
    public String describe() {
        return super.describe()
                + " | Lanes: " + numberOfLanes
                + " | Digital Board: " + (hasDigitalMenuBoard ? "Yes" : "No")
                + " | 24 Hours: " + (is24Hours ? "Yes" : "No");
    }

    @Override
    public double calculateAverageMealCost() {
        return 8.00;
    }

    public String getLaneInfo() {
        String info = getName() + " has " + numberOfLanes + " drive-through lane(s).";
        if (is24Hours) {
            info += " Open 24 hours!";
        }
        return info;
    }

    public int getNumberOfLanes() {
        return numberOfLanes;
    }

    public void setNumberOfLanes(int numberOfLanes) {
        this.numberOfLanes = numberOfLanes;
    }

    public boolean isHasDigitalMenuBoard() {
        return hasDigitalMenuBoard;
    }

    public void setHasDigitalMenuBoard(boolean hasDigitalMenuBoard) {
        this.hasDigitalMenuBoard = hasDigitalMenuBoard;
    }

    public boolean isIs24Hours() {
        return is24Hours;
    }

    public void setIs24Hours(boolean is24Hours) {
        this.is24Hours = is24Hours;
    }
}
