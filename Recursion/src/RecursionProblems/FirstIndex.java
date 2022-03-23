/*
Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array.
 Return -1 if it is not present in the array.
 */
package RecursionProblems;

public class FirstIndex {
    public static int firstIndex(int input[], int index, int x){
        if(input.length==index)
            return -1;
        if(input[index]==x)
            return index;
        return firstIndex(input,index+1,x);
    }

    public static int firstIndex(int input[], int x) {

        return firstIndex(input, 0, x);
    }
}
