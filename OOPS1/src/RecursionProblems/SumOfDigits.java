/*
Write a recursive function that returns the sum of the digits of a given integer.
 */

package RecursionProblems;

public class SumOfDigits {
    public static int sumOfDigits(int input){
        // Write your code here
        if(input<10)
            return input;

        return (input%10)+sumOfDigits(input/10);
    }
}
