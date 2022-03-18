/*
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
 */
package RecursionProblems;

public class CountZeros {
    public static int countZerosRec(int input){
        // Write your code here
        if(input==0)
            return 1;
        if(input>0 && input<10)
            return 0;

        if(input%10 == 0)
            return 1 + countZerosRec(input/10);
        else
            return countZerosRec(input/10);
    }
}
