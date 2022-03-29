/*
For a given expression in the form of a string,
 find if there exist any redundant brackets or not.
 It is given that the expression contains only rounded brackets or parenthesis and the input expression will always be balanced.
A pair of the bracket is said to be redundant when a sub-expression is surrounded by unnecessary or needless brackets.

Example:
Expression: (a+b)+c
Since there are no needless brackets, hence, the output must be 'false'.

Expression: ((a+b))
The expression can be reduced to (a+b). Hence the expression has redundant brackets and the output will be 'true'.
 */

package Stack.src;
import java.util.Stack;
public class CheckRedundantBrackets {
    public static boolean checkRedundantBrackets(String expression) {
        //Your code goes here
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='('){
                stack.push(0);
            }
            else if(expression.charAt(i)!=')' && !stack.isEmpty())
            {
                int temp=stack.pop();
                temp++;
                stack.push(temp);
            }
            else if(expression.charAt(i)==')' && !stack.isEmpty()){
                if(stack.pop()<=2)
                    return true;
            }
        }
        return false;
    }
}
