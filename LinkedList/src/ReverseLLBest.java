/*
Given a singly linked list of integers, reverse it iteratively and return the head to the modified list.
 */

package LinkedList.src;

public class ReverseLLBest {
    public static Node<Integer> reverse_I(Node<Integer> head){
        Node<Integer> prev = null;
        Node<Integer> next = null;
        Node<Integer> curr = head;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
