/*
You have been given two stacks that can store integers as the data. Out of the two given stacks,
one is populated and the other one is empty.
You are required to write a function that reverses the populated stack using the one which is empty.
 */

package Stack.src.recursion;

import java.util.Stack;

public class ReverseStack {
    public static void reverseRecur(Stack<Integer> input, Stack<Integer> helper){
        if(input.isEmpty()==true)
            return;
        int temp = input.pop();
        reverseRecur(input, helper);
        helper.push(temp);
    }

    public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
        //Your code goes here
        reverseRecur(input, extra);
        while(!extra.isEmpty()){
            input.push(extra.pop());
        }
    }
}
}
