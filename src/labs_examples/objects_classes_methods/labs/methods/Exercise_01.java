package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int prod = multiply(5,4);
        System.out.println(prod);
        double result = divide(10, 2);
        System.out.println(result);
        printJoke();
        System.out.println(convertToSeconds(5));

        sumAll(10);
        sumAll(10,20,30);
        sumAll(100,150,275, 300, 550);



    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b


    // 3) Create a static void method that will print of joke of your choice to the console


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents


    // 5) Create a varargs method that will return the length of the varargs array passed in
    public static void sumAll(int a, int... nums){
        int sum = 0;
        for (int i : nums){
            sum += i;
        }
        System.out.println("sum equal " + sum);
    }

    public static int multiply(int a, int b){
        int val = a * b;
        System.out.println(val);
        return val;
    }

    public static int divide(int a, int b){
        return a / b;
    }

    public static void printJoke(){
        System.out.println("Knock Knock who's there");
    }

    public static int convertToSeconds(int years){
        int seconds = 31556952;
        return years * seconds;
    }




}
