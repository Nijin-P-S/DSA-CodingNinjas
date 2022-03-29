/*
For a given a string expression containing only round brackets or parentheses,
 check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
 */

package Stack.src;

import java.util.Stack;

public class BracketsBalanced {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<expression.length();i++){
            if(expression.charAt(i)=='(' || expression.charAt(i)=='{')
                stack.push(expression.charAt(i));

            else{
                if(expression.charAt(i)==')'){
                    if(stack.isEmpty()==true || stack.peek()!='('){
                        return false;
                    }
                    else
                        stack.pop();
                }
                else if(expression.charAt(i)=='}'){
                    if(stack.isEmpty()==true || stack.peek()!='{'){
                        return false;
                    }
                    else
                        stack.pop();
                }
            }
        }

        if(stack.isEmpty()==true)
            return true;
        else
            return false;
    }
}
