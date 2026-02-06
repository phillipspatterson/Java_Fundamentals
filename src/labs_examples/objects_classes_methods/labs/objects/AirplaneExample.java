package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {

    public static void main(String[] args) {

        Model myModel = new Model("Boeing");
        Airline myAirline = new Airline("Delta");
        Seats numberOfSeats = new Seats(100);
        Airplane myAirplane = new Airplane("blue", "jet", myModel, myAirline, numberOfSeats);

        System.out.println("Color: " + myAirplane.getColor());
        System.out.println("Type: " + myAirplane.getType());
        System.out.println("Model: " + myAirplane.getModel().getModelName());
        System.out.println("Airline: " + myAirplane.getAirline().getAirlineName());
        System.out.println("Seats: " + myAirplane.getSeats().getNumberOfSeats());
        System.out.println("Fuel Capacity: " + myAirplane.getFuelCapacity());
        System.out.println("Current Fuel: " + myAirplane.getCurrentFuelLevel());

        System.out.println("\n--- Using Setters ---");
        myAirplane.setColor("red");
        myAirplane.setType("propeller");
        myAirplane.getModel().setModelName("Cessna");
        myAirplane.getAirline().setAirlineName("Southwest");
        myAirplane.getSeats().setNumberOfSeats(50);
        myAirplane.setFuelCapacity(2000.0);
        myAirplane.setCurrentFuelLevel(1500.0);

        System.out.println("New Color: " + myAirplane.getColor());
        System.out.println("New Model: " + myAirplane.getModel().getModelName());

        System.out.println(myModel);
        System.out.println(myAirline);
        System.out.println(numberOfSeats);
        System.out.println(myAirplane);
    }
}

    class Model{
        private String modelName;
        public Model(String modelName){
            this.modelName = modelName;
        }
        public String getModelName() {
            return modelName;
        }
        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        @Override
        public String toString() {
            return "Model{modelName='" + modelName + "'}";
        }
    }

    class Airline{
        private String airlineName;
        public  Airline(String airlineName){
            this.airlineName = airlineName;
        }
        public String getAirlineName(){
            return airlineName;
        }
        public void setAirlineName(String airlineName){
            this.airlineName = airlineName;
        }
        @Override
        public String toString() {
            return "Airline{airlineName ='" + airlineName + "'}";
        }
    }

    class Seats{
       private Integer numberOfSeats;
        public Seats(Integer numberOfSeats){
            this.numberOfSeats = numberOfSeats;
        }
        public Integer getNumberOfSeats(){
            return numberOfSeats;
        }
        public void setNumberOfSeats(Integer numberOfSeats){
            this.numberOfSeats = numberOfSeats;
        }
        @Override
        public String toString(){
            return "Seats{numberOfSeats ='" + numberOfSeats + "'}";
        }
    }

    class Airplane{

        private String color;
        private String type;
        private Model model;
        private Airline airline;
        private Seats seats;
        private double fuelCapacity;
        private double currentFuelLevel;

        public Airplane(String color, String type, Model model, Airline airline, Seats seats){
            this.color = color;
            this.type = type;
            this.model = model;
            this.airline = airline;
            this.seats = seats;
        }

        public String getColor() {
            return color;
        }
        public String getType() {
            return type;
        }
        public double getFuelCapacity() {
            return fuelCapacity;
        }
        public double getCurrentFuelLevel() {
            return currentFuelLevel;
        }
        public Model getModel() {
            return model;
        }
        public Airline getAirline() {
            return airline;
        }
        public Seats getSeats() {
            return seats;
        }

        public void setColor(String color) {
            this.color = color;
        }
        public void setType(String type) {
            this.type = type;
        }
        public void setFuelCapacity(double fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }
        public void setCurrentFuelLevel(double currentFuelLevel) {
            this.currentFuelLevel = currentFuelLevel;
        }
        public void setModel(Model model) {
            this.model = model;
        }
        public void setAirline(Airline airline) {
            this.airline = airline;
        }
        public void setSeats(Seats seats) {
            this.seats = seats;
        }

        @Override
        public String toString() {
            return "Airplane{" +
                    "color='" + color + "'" +
                    ", type='" + type + "'" +
                    ", fuelCapacity=" + fuelCapacity +
                    ", currentFuelLevel=" + currentFuelLevel +
                    ", model=" + model +
                    ", airline=" + airline +
                    ", seats=" + seats +
                    "}";
        }
    }



