package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

public class ExceptionHandling6 {

    static void testMethod() {
        System.out.println("testMethod: something went wrong, throwing...");
        throw new IllegalArgumentException("Error thrown from testMethod");
    }

    static void callingMethod() {
        try {
            testMethod();
        } catch (IllegalArgumentException e) {
            System.out.println("callingMethod caught it: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        callingMethod();
    }

}