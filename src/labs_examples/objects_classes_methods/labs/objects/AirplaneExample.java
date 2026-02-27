package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {

    public static void main(String[] args) {

        Airline myAirline = new Airline("Delta");
        Airplane myAirplane = new Airplane("blue", "jet", "Gulfstream", myAirline, new Seat[1]);

        System.out.println("Color: " + myAirplane.getColor());
        System.out.println("Type: " + myAirplane.getType());
        System.out.println("Airline: " + myAirplane.getAirline().getAirlineName());
        System.out.println("Fuel Capacity: " + myAirplane.getFuelCapacity());
        System.out.println("Current Fuel: " + myAirplane.getCurrentFuelLevel());
        System.out.println(7);
        System.out.println(7.5);
        System.out.println(true);

        System.out.println("\n--- Using Setters ---");
        myAirplane.setColor("red");
        myAirplane.setType("propeller");
        myAirplane.getAirline().setAirlineName("Southwest");
        myAirplane.setFuelCapacity(2000.0);
        myAirplane.setCurrentFuelLevel(1500.0);

        System.out.println("New Color: " + myAirplane.getColor());

        System.out.println(myAirline);
        System.out.println(myAirplane);
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

    class Seat{
       private boolean firstClass;
       private boolean recline;
       private String fabric;

    }

    class Airplane{

        private String color;
        private String type;
        private String model;
        private Airline airline;
        private Seat[] seats;
        private double fuelCapacity;
        private double currentFuelLevel;

        public Airplane(String color, String type, String model, Airline airline, Seat[] seats){
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

        public Airline getAirline() {
            return airline;
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

        public void setAirline(Airline airline) {
            this.airline = airline;
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



