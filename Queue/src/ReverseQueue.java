/*
You have been given a queue that can store integers as the data.
 You are required to write a function that reverses the populated queue itself without using any other data structures.
 */

package Queue.src;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void reverseQueue(Queue<Integer> input) {
        //Your code goes here
        if(input.isEmpty())
            return;

        Integer temp = input.poll();
        reverseQueue(input);
        input.add(temp);
    }
}
