package labs_examples.objects_classes_methods.labs.objects;

public class AssociationExample {
    public static void main(String[] args) {

    }
}

class Pilot {
    private String name;
    private Integer yearsExperience;
    private Aircraft assignedAircraft;

    public Pilot(String name, int yearsExperience) {
        this.name = name;
        this.yearsExperience = yearsExperience;
    }
}

class Aircraft {
    private String aircraftModel;
    private String airlineName;

    public Aircraft(String aircraftModel, String airlineName) {
        this.aircraftModel = aircraftModel;
        this.airlineName = airlineName;
    }
}
