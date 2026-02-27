package labs_examples.objects_classes_methods.labs.oop.A_inheritance.restaurantexample;

public class RestaurantController {
    public static void main(String[] args) {
        FastFood wendys = new FastFood("Wendy's", "123 Main St", 1969, 3.8, true,4);

        DriveThrough chickFila = new DriveThrough("Chickfila", "456 Chick Way", 1967, 4.5, true, 2, 2, true, false);

        PizzaChain dominos = new PizzaChain("Domino's", "789 West St", 1960, 3.6, false, 10, true, 10, "Supreme");

        DineIn texasRoadHouse = new DineIn("Texas Roadhouse", "100 Texas Way", 1990, 3.9, true, 75, 18.0);

        FineDining nobu = new FineDining("Nobu", "100 Ella Drive", 1980, 4.9, true, 50, 22.0, true, true,3);

        System.out.println("FastFood name (from Restaurant): " + wendys.getName());
        System.out.println("DriveThrough name (from Restaurant): " + chickFila.getName());
        System.out.println("DriveThrough year (from Restaurant): " + chickFila.getYearEstablished());
        System.out.println("PizzaChain address (from Restaurant): " + dominos.getAddress());
        System.out.println("FineDining name (from Restaurant): " + nobu.getName());
        System.out.println("FineDining rating (from Restaurant): " + nobu.getAverageRating());
        // FineDining also has access to DineIn's fields since DineIn is its parent:
        System.out.println("FineDining seating (from DineIn): " + nobu.getSeatingCapacity());
        System.out.println("FineDining tip % (from DineIn): " + nobu.getTipPercentageSuggested());
        System.out.println();

        System.out.println("=== DEMONSTRATING METHOD OVERRIDING ===\n");

        // --- describe() is overridden at every level ---
        System.out.println("--- describe() overrides ---");
        // Each class adds its own info on top of the parent's description:
        System.out.println("FastFood:     " + wendys.describe());
        System.out.println("DriveThrough: " + chickFila.describe());
        System.out.println("PizzaChain:   " + dominos.describe());
        System.out.println("DineIn:       " + texasRoadHouse.describe());
        System.out.println("FineDining:   " + nobu.describe());
        System.out.println();

        System.out.println("--- getServiceStyle() overrides ---");
        System.out.println("FastFood:     " + wendys.getServiceStyle());
        System.out.println("DriveThrough: " + chickFila.getServiceStyle());
        System.out.println("PizzaChain:   " + dominos.getServiceStyle());
        System.out.println("DineIn:       " + texasRoadHouse.getServiceStyle());
        System.out.println("FineDining:   " + nobu.getServiceStyle());
        System.out.println();

        System.out.println("--- calculateAverageMealCost() overrides ---");
        System.out.println("FastFood avg meal:     $" + wendys.calculateAverageMealCost());
        System.out.println("DriveThrough avg meal: $" + chickFila.calculateAverageMealCost());
        System.out.println("PizzaChain avg meal:   $" + dominos.calculateAverageMealCost());
        System.out.println("DineIn avg meal:       $" + texasRoadHouse.calculateAverageMealCost());
        System.out.println("FineDining avg meal:   $" + nobu.calculateAverageMealCost());
        System.out.println();

        System.out.println("=== CLASS-SPECIFIC METHODS ===\n");
        System.out.println(wendys.getQuickOrderInfo());           // FastFood method
        System.out.println(chickFila.getLaneInfo());               // DriveThrough method
        System.out.println(dominos.getDeliveryInfo());             // PizzaChain method
        System.out.println(texasRoadHouse.getReservationInfo());      // D
        System.out.println(nobu.getExclusiveInfo());
        System.out.println();

        Restaurant[] allRestaurants = {wendys, chickFila, dominos, texasRoadHouse, nobu};

        System.out.println("Looping through Restaurant[] array - Java calls the correct override:");
        for (Restaurant r : allRestaurants) {
            // Even though 'r' is typed as Restaurant, Java calls the
            // overridden version from the ACTUAL class (FastFood, DriveThrough, etc.)
            System.out.println("  " + r.getName() + " → Service: " + r.getServiceStyle()
                    + " → Avg Meal: $" + r.calculateAverageMealCost());
        }
    }
}
