package labs_examples.objects_classes_methods.Demo;

public class DogController {
    public static void main(String[] args) {

        //object from the blueprint(Dog)
        Dog dog1 = new Dog();
        dog1.breed = "Great Dane";
        dog1.color = "Black";
        dog1.name = "Kobe";
        dog1.setNumberOfPaws(4);

        //object from the blueprint(Dog)
        Dog dog2 = new Dog();
        dog2.breed = "Lab";
        dog2.color = "White";
        dog2.name = "Buddy";
        dog2.setNumberOfPaws(3);

        Dog[] dogs = new Dog[2];
        dogs[0] = dog1;
        dogs[1] = dog2;

        for (Dog d : dogs) {
            System.out.println(d.name);
            d.bark();
        }
        dog1.fetch("frisbee");
        dog2.fetch("tennis ball");
    }


}
