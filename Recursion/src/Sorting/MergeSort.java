package Sorting;

public class MergeSort {


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

    public static void main(String[] args) {
        int array[] = {3,5,1,6,4,0,80,7};
        mergeSort(array);
        for(int val: array)
            System.out.println(val);
    }
}
