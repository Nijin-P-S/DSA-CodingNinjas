package RecursionProblems;

public class NumberPresentInArray {
    public static boolean checkNumber(int[] input, int size , int num){
        if(input.length==size)
            return false;
        if(input[size]==num)
            return true;
        return checkNumber(input,size+1,num);
    }

    public static boolean checkNumber(int[] input, int x) {
        return checkNumber(input,0,x);
    }

    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,7,8,100};
        System.out.println(checkNumber(array, 99));
    }
}
