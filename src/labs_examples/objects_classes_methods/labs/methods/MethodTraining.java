package labs_examples.objects_classes_methods.labs.methods;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTraining {
    public static void main(String[] args) {
    int result = largestNumber(3,50,8,10);
        System.out.println(result);

    int textResult = countConsonants("banana");
        System.out.println(textResult);

    boolean res = isPrime(11);
        System.out.println(res);

    int[] testArray = {5, 2, 9, 1, 7, 3};
    int[] arrayResult = getMinMax(testArray);
        System.out.println(Arrays.toString(arrayResult));

    ArrayList<Integer> arrayListResult = getDivisibleNumbers(100, 3, 5);
        System.out.println(arrayListResult);
        System.out.println(arrayListResult.size());

    int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Before: " + Arrays.toString(numbers));

        reverseArray(numbers);

        System.out.println("After: " + Arrays.toString(numbers));
    }

    public static int largestNumber(int a, int b, int c, int d){
        int largest = a;

        if (b > largest){
            largest = b;
        }
        if (c > largest){
            largest = c;
        }
        if (d > largest){
            largest = d;
        }
        return  largest;
    }

    public static int countConsonants(String word){
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            char currentChar = word.charAt(i);
            if (Character.isLetter(currentChar)){
                if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i'
                        && currentChar != 'o' && currentChar != 'u') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPrime(int num){
        for (int i = 2; i <= num/2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int[] getMinMax(int[] numbers){

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int[] minMaxResult = {min, max};
        return minMaxResult;
    }

    public static ArrayList<Integer> getDivisibleNumbers(int maxNum, int divisor1, int divisor2) {

        ArrayList<Integer> divisibleList = new ArrayList<Integer>();

        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0) {
                divisibleList.add(i);
            }
        }
        return divisibleList;
    }

    public static void reverseArray(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;        //
        }
    }
}

