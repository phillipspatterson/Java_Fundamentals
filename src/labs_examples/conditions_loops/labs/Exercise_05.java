package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user to input
        System.out.println("Enter the lower bound number: ");
        // assign input to variable as int
        int lower = scanner.nextInt();
        System.out.println("Enter the upper bound: ");
        int upper = scanner.nextInt();
        //TODO: how to set up the for loop to take the lower and upper bound. Also how to setup the logic
        //for loop
        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);

        int sum = 0;
        double average = 0;

        for (int i = lower; i <= upper; i++) {
            sum += i;
        }

        average = (lower + upper) / 2.0;

        System.out.println("the sum of all numbers between: " + lower + " and " + upper + " is " + sum);
        System.out.println("average: " + average);
    }

}
