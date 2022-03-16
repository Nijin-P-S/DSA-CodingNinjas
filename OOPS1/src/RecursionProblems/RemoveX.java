//Given a string, compute recursively a new string where all 'x' chars have been removed.

package RecursionProblems;

public class RemoveX {
    public static String removeX(String input){
//         Base case
        if(input.length() == 0 )
            return input;

//         Hypothesis
        String smallOutput = removeX(input.substring(1));

//         Logic
        if(input.charAt(0)=='x')
            return smallOutput;
        else
            return input.charAt(0)+smallOutput;
    }
}
