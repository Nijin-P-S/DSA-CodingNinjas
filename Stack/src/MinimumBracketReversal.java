/*
For a given expression in the form of a string, find the minimum number of brackets that can be reversed in order to
make the expression balanced. The expression will only contain curly brackets.
If the expression can't be balanced, return -1.
 */
package Stack.src;

import java.util.Stack;
public class MinimumBracketReversal {
    public static int countBracketReversals(String input) {
        //Your code goes here
        if(input.length() == 0)
            return 0;
        if(input.length()%2 != 0 )
            return -1;
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(int i=0 ; i < input.length(); i++){
            if(stack.isEmpty())
                stack.push(input.charAt(i));
            else if(input.charAt(i)=='}' && stack.peek() == '{')
                stack.pop();
            else
                stack.push(input.charAt(i));
        }

        while(!stack.isEmpty()){
            char c1 = stack.pop();
            char c2 = stack.pop();
            if(c1 == c2)
                count++;
            else
                count+=2;
        }

        return count;
    }
}
