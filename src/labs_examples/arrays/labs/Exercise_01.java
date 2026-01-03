package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        // create a scanner to input 10 numbers
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[10];
        int sum = 0;
        int average = 0;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number: ");
            nums[i] = scanner.nextInt();
            sum = sum + nums[i];
        }
        System.out.println("Sum: " + sum);
        average = sum/10;
        System.out.println("Average: " + average);
    }

}