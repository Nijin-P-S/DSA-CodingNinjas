/*
Given an integer array arr[], the task is to check if the input array can be split in two sub-arrays such that:


Sum of both the sub-arrays is equal.
All the elements which are divisible by 5 should be in the same group.
All the elements which are divisible by 3 (but not divisible by 5) should be in the other group.
Elements which are neither divisible by 5 nor by 3 can be put in any group.
If possible then print Yes else print No.
 */

package RecursionProblems;

public class SplitArray {
    public static boolean helper(int arr[], int n,
                          int start, int lsum, int rsum)
    {

        // If reached the end
        if (start == n)
            return lsum == rsum;

        // If divisible by 5 then add to the left sum
        if (arr[start] % 5 == 0)
            lsum += arr[start];

            // If divisible by 3 but not by 5
            // then add to the right sum
        else if (arr[start] % 3 == 0)
            rsum += arr[start];

            // Else it can be added to any of the sub-arrays
        else

            // Try adding in both the sub-arrays (one by one)
            // and check whether the condition satisfies
            return helper(arr, n, start + 1, lsum + arr[start], rsum)
                    || helper(arr, n, start + 1, lsum, rsum + arr[start]);

        // For cases when element is multiple of 3 or 5.
        return helper(arr, n, start + 1, lsum, rsum);
    }

    // Function to start the recursive calls
    static boolean splitArray(int arr[], int n)
    {
        // Initially start, lsum and rsum will all be 0
        return helper(arr, n, 0, 0, 0);
    }

    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 4, 3 };
        int n = arr.length;

        if (splitArray(arr, n))
            System.out.println( "Yes");
        else
            System.out.println( "No");
    }
}
