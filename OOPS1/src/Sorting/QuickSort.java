package Sorting;

public class QuickSort {
    public static void quickSort(int[] input, int left, int right){
        if(right-left<1)
            return;
        int index = findPivot(input, left, right);
        swap(input, left, index);
        int position1= left;
        int position2 = right;
        while(position1<index && position2>index){
            if(input[position1]>input[index]){
                while(input[position2]>input[index])
                    position2--;
                swap(input,position1, position2);
                position1++;
            }
            else
                position1++;
        }
        quickSort(input, left, index-1);
        quickSort(input, index+1, right);
    }

    private static void swap(int[] input, int left, int index) {
        int temp=input[left];
        input[left]=input[index];
        input[index]=temp;
    }

    private static int findPivot(int input[], int left, int right) {
        int count=0;
        for(int i=left+1;i<=right;i++){
            if (input[left]>=input[i])
                count++;
        }
        return (left+count);
    }


    public static void quickSort(int[] input) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * No need to print or return the output.
         * Taking input and printing output is handled automatically.
         */
        quickSort(input, 0, input.length-1);
    }

    public static void main(String[] args) {
        int array[] = {2, 6 ,8 ,5 ,4 ,3};
        quickSort(array);
        for(int val: array)
            System.out.println(val);
    }
}
