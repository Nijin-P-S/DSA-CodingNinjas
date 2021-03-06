/*
A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
 Implement a method to count how many possible ways the child can run up to the stairs.
You need to return number of possible ways W.
 */
package RecursionProblems;

public class StairCase {
    public static int staircase(int n){

        if(n==0)
            return 1;
        if(n<0)
            return 0;
        int count1 = staircase(n-1);
        int count2 = staircase(n-2);
        int count3 = staircase(n-3);


        return count1+count2+count3;
    }
}
