/*
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively.
 You need to print their intersection;
 An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in
 other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list(ARR1).
 */

public class ArrayIntersection {
    public static void intersection(int[] arr1, int[] arr2) {
        //Your code goes here
        mergeSort(arr1);
        mergeSort(arr2);

        int pointer1=0;
        int pointer2=0;
        while(pointer2<arr2.length && pointer1<arr1.length){
            if(arr1[pointer1]==arr2[pointer2]){
                System.out.print(arr2[pointer2]+" ");
                pointer2++;
                pointer1++;
            }
            else if(arr1[pointer1]<arr2[pointer2])
                pointer1++;
            else
                pointer2++;
        }



    }

    public static void mergeSort(int[] input){
        // Write your code here
        if(input.length<=1)
            return;

        int mid=(0+input.length)/2;
        int s1[] = new int[mid];
        int s2[] = new int[input.length-mid];

        for(int i=0;i<s1.length;i++)
            s1[i]=input[i];
        for(int j=0;j<s2.length;j++){
            s2[j]=input[s1.length+j];
        }

        mergeSort(s1);
        mergeSort(s2);
        merge(s1, s2, input);
    }

    public static void merge(int[] s1, int[] s2, int[] original){
        int pointer1=0;
        int pointer2=0;
        int i=0;

        while(pointer1<=s1.length-1 && pointer2<=s2.length-1){
            if(s1[pointer1]<=s2[pointer2]){
                original[i++]=s1[pointer1++];
            }
            else
            {
                original[i++]=s2[pointer2++];
            }
        }


        while(pointer1<=s1.length-1){
            original[i++]=s1[pointer1++];
        }
        while(pointer2<=s2.length-1){
            original[i++]=s2[pointer2++];
        }
    }
}
