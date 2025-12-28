package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {
    public static void main(String[] args) {
        //create a scanner
        Scanner scanner = new Scanner(System.in);
        //prompt user
        System.out.println("Enter a month between 1 and 12 to determine the month in the year");
        //Assign input to variable as int
        int month = scanner.nextInt();

    }
}
