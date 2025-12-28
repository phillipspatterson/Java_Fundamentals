package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        //create scanner
        Scanner scanner = new Scanner(System.in);
        //prompt user
        System.out.println("Enter a word");
        //Assign input as a variable string
        String word = scanner.next();

        String vowels = "aeiou";
        int index = 0;

        while (index < word.length()){
            char currentChar = Character.toLowerCase(word.charAt(index));

            if (vowels.indexOf(currentChar) != -1) {
                System.out.println("Word: " + word);
                System.out.println("First vowel: " + word.charAt(index));
                break;
            }
            index++;
        }
    }
}
