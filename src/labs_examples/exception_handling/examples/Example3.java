package labs_examples.exception_handling.examples;

// Let JVM handle the error.
class NotHandled {
    public static void main(String args[]) {
        int nums[] = new int[4];

        System.out.println("Before exception is generated.");
        try {
        // generate an index out-of-bounds exception

            nums[12/6] = 10;
            System.out.println("this won't display");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException exc) {
            System.out.println("Can't divide by zero");
        }
        finally {
            System.out.println("Do nothing!");
        }
        System.out.println("After catch statement");
    }
}
