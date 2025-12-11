package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int num = str.length();
        System.out.println("num = " + num);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean result = str.equalsIgnoreCase(str2);
        System.out.println("result = " + result);
        // please concatenate str & str2 and set the result to a new String variable below
        String str3 = str + str2;
        System.out.println("str = " + str3);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        String str4 = str.replace('e','a');
        System.out.println(str4);
        String str5 = str2.substring(3);
        System.out.println(str5);



    }


}