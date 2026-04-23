package labs_examples.exception_handling.labs;

import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        int[] nums = new int[2];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter two numbers separated by a comma to divide");
            try {
                String userVals = scanner.next();
                String[] strNums = userVals.split(",");
                int a = Integer.parseInt(strNums[0]);
                int b = Integer.parseInt(strNums[1]);
                nums[0] = a;
                nums[1] = b;
                int r = divideArray(nums);
                System.out.println(a + " divided by " + b + " = " + r);
                break;
            } catch (ArithmeticException ae) {
                System.out.println("Message: Can't divide by zero");
            } catch (ArrayIndexOutOfBoundsException ai) {
                System.out.println("Message: Need at least two numbers");
            } catch (Exception e) {
                System.out.println("Message: " + e.getMessage());
            }
        }
        System.out.println("Goodbye!");

    }

    public static int divideArray(int[] nums) throws ArithmeticException, ArrayIndexOutOfBoundsException, MyExcpetion {
        if (nums[0] < 0 || nums[1] < 0){
            throw new MyExcpetion("I don't like negative numbers");
        }
        return nums[0] / nums[1];
    }
}
