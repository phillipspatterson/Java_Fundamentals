package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
public class ExceptionHandling3 {

    public static void main(String[] args) {

        int numerator = 10;
        int denominator = 0;

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Caught an error: " + e.getMessage());

        } finally {
            System.out.println("This always runs, no matter what.");
        }

    }
}
