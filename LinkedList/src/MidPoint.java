/*
For a given singly linked list of integers, find and return the node present at the middle of the list.
 */

package LinkedList.src;

public class MidPoint {

    public static Node<Integer> midPoint(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null)
            return head;

        Node<Integer> result = head;
        Node<Integer> fastPointer = head;

        while(fastPointer!=null && fastPointer.next!=null && fastPointer.next.next!=null){
            result=result.next;
            fastPointer = fastPointer.next.next;
        }

        return result;
    }
}
