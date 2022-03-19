/*
For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)]
is equal to the sum of elements at indices [(i + 1) to (N-1)].
One thing to note here is, the item at the index 'i' is not included in either part.
If more than one equilibrium indices are present,
then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.
 */

public class ArrayEquilibriumIndex {
    public static int arrayEquilibriumIndex(int[] arr){
        int sum=0;
        for(int val: arr)
            sum+=val;

        int leftSum=0;
        for(int i=0;i<arr.length;i++)
        {
            leftSum+=arr[i];
            if(leftSum == (sum+arr[i])-leftSum)
                return i;
        }
        return -1;
    }
}
