package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class DineIn extends Restaurant {
    private boolean acceptsReservations;
    private int seatingCapacity;
    private double tipPercentageSuggested;

    public DineIn() {
        super();
        this.acceptsReservations = true;
        this.seatingCapacity = 100;
        this.tipPercentageSuggested = 18.0;
    }

    public DineIn(String name, String address, int yearEstablished,
                  double averageRating, boolean acceptsReservations,
                  int seatingCapacity, double tipPercentageSuggested){
        super(name, address, yearEstablished, averageRating);
        this.acceptsReservations = acceptsReservations;
        this.seatingCapacity = seatingCapacity;
        this.tipPercentageSuggested = tipPercentageSuggested;
    }

    @Override
    public String getServiceStyle() {
        return "Full table service with wait staff";
    }

    @Override
    public double calculateAverageMealCost() {
        return 35.00;
    }

    @Override
    public String describe() {
        return super.describe()
                + " | Reservations: " + (acceptsReservations ? "Yes" : "No")
                + " | Seats: " + seatingCapacity
                + " | Suggested Tip: " + tipPercentageSuggested + "%";
    }

    public String getReservationInfo() {
        if (acceptsReservations) {
            return getName() + " accepts reservations. Seating for " + seatingCapacity + " guests.";
        }
        return getName() + " is walk-in only.";
    }

    public boolean isAcceptsReservations() {
        return acceptsReservations;
    }

    public void setAcceptsReservations(boolean acceptsReservations) {
        this.acceptsReservations = acceptsReservations;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getTipPercentageSuggested() {
        return tipPercentageSuggested;
    }

    public void setTipPercentageSuggested(double tipPercentageSuggested) {
        this.tipPercentageSuggested = tipPercentageSuggested;
    }
}
