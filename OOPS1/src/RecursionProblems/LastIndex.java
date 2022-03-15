/*
Given an array of length N and an integer x, you need to find and return the last index of integer x present in the array.
 Return -1 if it is not present in the array.
 */

package RecursionProblems;

public class LastIndex {
    public static int lastIndex(int input[], int endIndex, int x){
        if(endIndex<0)
            return -1;
        if(input[endIndex]==x)
            return endIndex;
        return lastIndex(input, endIndex-1, x);
    }

    public static int lastIndex(int input[], int x) {

        return lastIndex(input, input.length-1, x);
    }
}
