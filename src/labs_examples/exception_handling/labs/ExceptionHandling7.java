package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class InvalidOrderException extends RuntimeException {
    public InvalidOrderException(String message) {
        super(message);
    }
}

public class ExceptionHandling7 {

    static void processOrder(int quantity) {
        if (quantity <= 0) {
            throw new InvalidOrderException("Order quantity must be greater than zero: " + quantity);
        }
        System.out.println("Order processed for quantity: " + quantity);
    }

    public static void main(String[] args) {
        try {
            processOrder(5);
            processOrder(0);
        } catch (InvalidOrderException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }
    }

}