package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class FineDining extends DineIn {

    private boolean hasAlcohol;
    private boolean dressCodeRequired;
    private int michelinStars;

    public FineDining() {
        super();
        this.hasAlcohol = false;
        this.dressCodeRequired = false;
        this.michelinStars = 0;
    }

    public FineDining(String name,
                      String address,
                      int yearEstablished,
                      double averageRating,
                      boolean acceptsReservations,
                      int seatingCapacity,
                      double tipPercentageSuggested,
                      boolean hasAlcohol,
                      boolean dressCodeRequired,
                      int michelinStars)
    {
        super(name,
                address,
                yearEstablished,
                averageRating,
                acceptsReservations,
                seatingCapacity,
                tipPercentageSuggested);

        this.hasAlcohol = hasAlcohol;
        this.dressCodeRequired = dressCodeRequired;
        this.michelinStars = michelinStars;
    }

    @Override
    public String getServiceStyle() {
        return "White-glove table service with multi-course tasting menus";
    }

    @Override
    public String describe() {
        String stars = (michelinStars > 0) ? michelinStars + " Michelin Star(s)" : "No Michelin Stars";
        return super.describe()
                + " | " + stars
                + " | Serves Alcohol: " + (hasAlcohol ? "Yes" : "No")
                + " | Dress Code: " + (dressCodeRequired ? "Required" : "None");
    }

    @Override
    public double calculateAverageMealCost() {
        return 150.00;
    }

    public String getExclusiveInfo() {
        String info = getName();
        if (michelinStars > 0) {
            info += " - " + michelinStars + " Michelin Star(s)!";
        }
        if (dressCodeRequired) {
            info += " Dress code required.";
        }
        if (hasAlcohol) {
            info += " Our wine is magnificent.";
        }
        return info;
    }

    public boolean isHasAlcohol() {
        return hasAlcohol;
    }

    public void setHasAlcohol(boolean hasAlcohol) {
        this.hasAlcohol = hasAlcohol;
    }

    public boolean isRequiresDressCode() {
        return dressCodeRequired;
    }

    public void setRequiresDressCode(boolean requiresDressCode) {
        this.dressCodeRequired = requiresDressCode;
    }

    public int getMichelinStars() {
        return michelinStars;
    }

    public void setMichelinStars(int michelinStars) {
        this.michelinStars = michelinStars;
    }
}
