package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class PizzaChain extends FastFood{
    private boolean offersDelivery;
    private int deliveryRadiusMiles;
    private String signaturePizza;

    public PizzaChain() {
        super();
        this.offersDelivery = true;
        this.deliveryRadiusMiles = 5;
        this.signaturePizza = "BBQ Chicken";
    }

    public PizzaChain(String name,
                      String address,
                      int yearEstablished,
                      double averageRating,
                      boolean hasDriveThrough,
                      int averageWaitTimeMinutes,
                      boolean offersDelivery,
                      int deliveryRadiusMiles,
                      String signaturePizza) {
        super(name, address, yearEstablished, averageRating,
                hasDriveThrough, averageWaitTimeMinutes);
        this.offersDelivery = offersDelivery;
        this.deliveryRadiusMiles = deliveryRadiusMiles;
        this.signaturePizza = signaturePizza;
    }

    @Override
    public String getServiceStyle() {
        if (offersDelivery) {
            return "Counter service + delivery within " + deliveryRadiusMiles + " miles";
        }
        return "Counter/carryout service only";
    }

    @Override
    public String describe() {
        return super.describe()
                + " | Signature Pizza: " + signaturePizza
                + " | Delivery: " + (offersDelivery ? "Yes (" + deliveryRadiusMiles + " mi)" : "No");
    }

    @Override
    public double calculateAverageMealCost() {
        return 12.00;
    }

    public String getDeliveryInfo() {
        if (offersDelivery) {
            return getName() + " delivers within " + deliveryRadiusMiles
                    + " miles. Try our " + signaturePizza + "!";
        }
        return getName() + " is carryout only.";
    }

    public boolean isOffersDelivery() {
        return offersDelivery;
    }

    public void setOffersDelivery(boolean offersDelivery) {
        this.offersDelivery = offersDelivery;
    }

    public int getDeliveryRadiusMiles() {
        return deliveryRadiusMiles;
    }

    public void setDeliveryRadiusMiles(int deliveryRadiusMiles) {
        this.deliveryRadiusMiles = deliveryRadiusMiles;
    }

    public String getSignaturePizza() {
        return signaturePizza;
    }

    public void setSignaturePizza(String signaturePizza) {
        this.signaturePizza = signaturePizza;
    }
}
