package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneExample {

    public static void main(String[] args) {

        Model myModel = new Model("Boeing");
        Airline myAirline = new Airline("Delta");
        Seats numberOfSeats = new Seats(100);
        Airplane myAirplane = new Airplane("blue", "jet", myModel, myAirline, numberOfSeats);

        System.out.println("I am flying on a " + myAirplane.color + " " + myAirplane.type + ". " + "The model is a "
                + myAirplane.model.modelName + " there is " + myAirplane.seats.numberOfSeats +
                " seats on the plane. I love flying on " + myAirplane.airline.airlineName);


    }
}

    class Model{
        String modelName;
        public Model(String modelName){
            this.modelName = modelName;
        }
    }

    class Airline{
        String airlineName;
        public  Airline(String airlineName){
            this.airlineName = airlineName;
        }
    }

    class Seats{
        Integer numberOfSeats;
        public Seats(Integer numberOfSeats){
            this.numberOfSeats = numberOfSeats;
        }
    }

    class Airplane{
        String color;
        String type;
        Model model;
        Airline airline;
        Seats seats;
        double fuelCapacity;
        double currentFuelLevel;
        public Airplane(String color, String type, Model model, Airline airline, Seats seats){
            this.color = color;
            this.type = type;
            this.model = model;
            this.airline = airline;
            this.seats = seats;
        }
    }

