/*
Given a singly linked list of integers and position 'i',
delete the node present at the 'i-th' position in the linked list recursively.
*/

package LinkedList.Recursive;

public class DeleteNode {
    public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
        //Your code goes here
        if(head==null && pos>0 || head==null && pos==0)
            return head;

        if(pos == 0)
            return head.next;

        else{
            head.next = deleteNodeRec(head.next, pos-1);
            return head;
        }
    }
}
