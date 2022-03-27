/*
You have been given a singly linked list of integers along with two integers, 'i,' and 'j.'
Swap the nodes that are present at the 'i-th' and 'j-th' positions.
 */
package LinkedList.src;

public class Swap2Nodes {
    public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
        //Your code goes here
        if(head==null || head.next==null || i==j)
            return head;

        Node<Integer> prev_i=null, next_i=null, swap_i=head;
        Node<Integer> prev_j=null, next_j=null, swap_j=head;

        if(j==i+1 || i==j+1){
            int min = Math.min(i,j);
            int max = Math.max(i,j);
            for(int count_i=0;count_i<min-1;count_i++){
                swap_i=swap_i.next;
            }

            prev_i=swap_i;
            swap_i = swap_i.next;
            next_i = swap_i.next;
            prev_i.next=next_i;
            swap_j = next_i;
            next_i=next_i.next;
            swap_j.next = swap_i;
            swap_i.next=next_i;

            return head;
        }



        else{
            int min = Math.min(i,j);
            int max = Math.max(i,j);
            for(int count_i=0;count_i<min-1;count_i++){
                swap_i=swap_i.next;
            }
            prev_i=swap_i;
            swap_i = swap_i.next;
            next_i = swap_i.next;
            prev_i.next=null;
            swap_i.next=null;
            swap_j=next_i;

            for(int count_j=min;count_j<max-2;count_j++){
                swap_j=swap_j.next;
            }
            prev_j=swap_j;
            swap_j = swap_j.next;
            next_j = swap_j.next;
            prev_j.next=null;
            swap_j.next=null;

            prev_i.next = swap_j;
            swap_j.next = next_i;

            prev_j.next = swap_i;
            swap_i.next = next_j;
        }

        return head;
    }

}
