package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {
    static void valueMethod(int value){
        if (value < 0){
            throw new IllegalArgumentException("Value cannot be negative" + value);
        }
        System.out.println("Value accepted: " + value);

    }
    public static void main(String[] args) {
        try {
            valueMethod(5);
            valueMethod(-1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }

}