package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
public class ExceptionHandling4 {

    public static void main(String[] args) {

        try {
            System.out.println("Outer try: starting outer operation...");

            try {
                System.out.println("Inner try: starting inner operation...");
                int result = 10 / 0;
                System.out.println("Inner result: " + result);

            } catch (ArithmeticException e) {
                System.out.println("Inner catch: caught an error -> " + e.getMessage());
            }

            System.out.println("Outer try: continuing after inner block...");

        } catch (Exception e) {
            System.out.println("Outer catch: caught an error -> " + e.getMessage());
        }

    }
}