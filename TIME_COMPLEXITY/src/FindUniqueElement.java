/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
 */

import java.util.HashMap;

public class FindUniqueElement {
    public static int findUnique(int[] arr) {
        //Your code goes here
        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for(int val: arr){
            if(hashmap.get(val)==null)
                hashmap.put(val, 1);
            else
                hashmap.put(val, hashmap.get(val)+1);
        }

        for(int val: arr){
            if(hashmap.get(val)==1)
                return val;
        }
        return -1;
    }
}
