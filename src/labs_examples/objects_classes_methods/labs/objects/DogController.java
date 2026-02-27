package labs_examples.objects_classes_methods.labs.objects;

public class DogController {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.setColor("Black");
        dog2.setColor("Grey");
        dog1.setBreed("Great Dane");
        dog2.setBreed("Cane Corso");
        dog1.bark();
        dog1.fetch();
        dog2.bark();
        dog2.fetch();
        dog1.play();
        dog2.play();
    }
}
