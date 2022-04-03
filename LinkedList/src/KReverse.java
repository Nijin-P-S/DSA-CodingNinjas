/*
Given a singly linked list of integers, reverse the nodes of the linked list 'k' at a time and return its modified list.
'k' is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of 'k,' then left-out nodes, in the end, should be reversed as well.
 */

package LinkedList.src;

public class KReverse {
    public static void reverse(Node<Integer> head){
        if(head == null)
            return;

        Node<Integer> prev = null;
        Node<Integer> curr = head;
        Node<Integer> next = null;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr=next;
        }

    }


    public static Node<Integer> kReverse(Node<Integer> head, int k) {
        //Your code goes here
        if(k==0 ||k==1|| head==null)
            return head;

        Node<Integer> tail = head;

        for(int i=0;i<k-1;i++){
            if(head.next==null)
                break;
            head = head.next;

        }

        Node<Integer> next = head.next;

        head.next= null;

        reverse(tail);

        tail.next = kReverse(next, k);

        return head;
    }
}
