/*
You have been given a singly linked list of integers along with two integers, 'M,' and 'N.'
Traverse the linked list such that you retain the 'M' nodes, then delete the next 'N' nodes.
 Continue the same until the end of the linked list.
To put it in other words, in the given linked list, you need to delete N nodes after every M nodes.
 */
package LinkedList.src;

public class DeleteNNodes {
    public static Node<Integer> skipMdeleteN(Node<Integer> head, int m, int n) {

        if(head == null || n==0)
            return head;
        if(m==0)
            return null;

        Node<Integer> pointer1 = head;
        Node<Integer> pointer2 = head;

        int count_m =0, count_n=0;

        while(pointer1!=null && pointer2!=null){
            count_m=1;
            while(count_m<m && pointer1!=null){
                pointer1=pointer1.next;
                count_m++;
            }

            if(pointer1!=null && pointer1.next!=null)
                pointer2 = pointer1.next;

            else
                return head;

            count_n=1;
            while(count_n<=n && pointer2!=null){
                pointer2=pointer2.next;
                count_n++;
            }

            pointer1.next = pointer2;
            pointer1 = pointer2;
        }

        return head;
    }
}
