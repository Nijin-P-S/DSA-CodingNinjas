/*
For a given queue containing all integer data, reverse the first K elements.
You have been required to make the desired change in the input queue itself.
 */

package Queue.src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {
    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        //Your code goes here

        int size = input.size();
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<k;i++){
            stack.push(input.poll());
        }

        for(int i=0;i<k;i++){
            input.add(stack.pop());
        }

        for(int i=0;i<(size-k);i++){
            input.add(input.poll());
        }

        return input;
    }
}
