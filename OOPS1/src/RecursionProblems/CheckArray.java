//Program to check whether the array is sorted or not using recursion

package RecursionProblems;

public class CheckArray {
    public static boolean checkArray(int array[], int size){
        if(size==1)
            return true;
        if(array[size-1]<array[size-2])
            return false;
        return true && checkArray(array,size-1);
    }

    public static void main(String[] args) {
        //Dry run case
        int array[] = {1,1,5,6,100};

        System.out.print(checkArray(array,array.length));
    }
}
