package RecursionProblems;

public class SumOfArray {
    public static int sum(int input[], int index){
        if(index== input.length)
            return 0;
        return input[index]+sum(input,index+1);
    }

    public static int sum(int input[]) {
        return sum(input,0);
    }

    public static void main(String[] args) {
        int array[] = {1};
        System.out.println(sum(array));
    }
}
