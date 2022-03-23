package RecursionProblems;

public class BinarySearch {

    public static int binarySearch(int input[], int start, int end, int number){
        if(start>end)
            return -1;
        int mid = (start+end)/2;

        if(input[mid]==number)
            return mid;
        else if(input[mid]>number)
            return binarySearch(input, start,mid-1, number);
        else
            return binarySearch(input, mid+1, end, number);
    }

    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,9,100};
        System.out.print(binarySearch(array,0,array.length-1,20));
    }
}
