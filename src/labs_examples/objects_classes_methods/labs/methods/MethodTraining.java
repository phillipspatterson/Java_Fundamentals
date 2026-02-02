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
        //loop through each character
        int counter = 0;
        for (int i = 0; i < word.length(); i++){
            //count when the character is not "a" "e" "i" "o" "u"
            char cons = word.charAt(i);
            if (cons != 'a' && cons != 'e' && cons != 'i' && cons != 'o' && cons != 'u'){
                //incrementing count characters
                counter++;
            }
        }
        return counter;

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
        //[8,7,5,9,2,4]

        for (int i = 0; i < arr.length / 2; i++) {
           //save first number in array to temp variable
            temp = arr[i];
            //
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;        //
        }
    }

    //return the season given an integer month
    public static String getSeason(int month){
        //month 9,10,11 = FALL
        if (month < 1 || month > 12){
            return "NOT VALID";
        }
        if(month >= 9 && month <= 11){
            return "FALL";
        } else if(month >= 12 && month <= 3){
            return "WINTER";
        } else if(month >= 4 && month <= 6){
            return "SPRING";
        } else {
            return "SUMMER";
        }
    }

    //given a string containing nothing but numbers return the sum
    public static int getSumOfString(String num){
        //loop through each index and add get the value and add the values together
        int sum = 0;
        for (int i = 0; i < num.length(); i++){
            char value = num.charAt(i);
            sum += Integer.parseInt(String.valueOf(value));

        }
        return sum;
    }

}

