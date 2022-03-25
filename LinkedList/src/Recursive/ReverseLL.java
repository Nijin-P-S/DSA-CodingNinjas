/*
Given a singly linked list of integers, reverse it using recursion and return the head to the modified list.
 You have to do this in O(N) time complexity where N is the size of the linked list.
 */

package LinkedList.Recursive;

public class ReverseLL {
    public static Node<Integer> reverseLinkedListRec(Node<Integer> head, Node<Integer> tail, int length, int size){
        if(length==0)
            return null;
        if(length==1)
        {
            return head;
        }

        Node<Integer> next = reverseLinkedListRec(head.next,tail, length-1, size);
        next.next = head;

        // System.out.print(next.data + " ");
        if(size==length){
            //  System.out.print(head.data + " ");
            head.next = null;
            return tail;
        }
        return head;

    }

    public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
        //Your code goes here
        int length=0;

        Node<Integer> tempNode = head;

        Node<Integer> tempNode2 = head;
        while(head!=null){
            if(head.next!=null){
                tempNode2=tempNode2.next;
            }
            head=head.next;
            length++;

        }
        int size = length;
        Node<Integer> tail = reverseLinkedListRec(tempNode, tempNode2, length, size);

        return tail;
    }
}
