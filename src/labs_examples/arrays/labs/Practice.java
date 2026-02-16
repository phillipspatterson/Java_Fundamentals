package labs_examples.arrays.labs;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        //take in 6 numbers from a user using a scanner and place those numbers into an array
        // print the sum of all even indexes and sum of all odd indexes

        //create scanner
        Scanner scanner = new Scanner(System.in);
        //create an array to hold 6 numbers
        int[] nums = new int[6];
        int evenTotal = 0;
        int oddTotal = 0;
        //loop 6 times
        for (int i = 0; i < nums.length; i++) {
            //get numbers from user and place in array
            //nums[0] = 7;
            System.out.println("Enter number: " + (i+1) + "->");
            nums[i] = scanner.nextInt();
        }

        //loop through the populated array
        for (int i = 0; i < nums.length; i++) {
            //check to see if index is even or odd
            //if even add to even total
            //if odd add to odd total1

            if (i % 2 == 0) {
                evenTotal += nums[i];
            } else {
                oddTotal += nums[i];
            }
        }
        //print the even total and odd total
        System.out.println("Even Total: " + evenTotal);
        System.out.println("Odd Total: " + oddTotal);
    }
}
