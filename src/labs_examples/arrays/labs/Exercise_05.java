package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        int[][] twoD = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = twoD.length - 1; i >= 0; i -= 2) {
            for (int j = twoD[i].length - 1; j >= 0; j -= 2) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
    }
}
