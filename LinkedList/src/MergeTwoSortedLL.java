/*
You have been given two sorted(in ascending order) singly linked lists of integers.
Write a function to merge them in such a way that the resulting singly linked list is also sorted(in ascending order)
and return the new head to the list.
 */
package LinkedList.src;

public class MergeTwoSortedLL {
    public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        if(head1==null)
            return head2;
        if(head2 == null)
            return head1;
        Node<Integer> temp = null;
        Node<Integer> head = null;
        int count=0;

        while(head1!=null && head2!=null){
            if(head1.data <= head2.data){
                if(count==0){
                    head = head1;
                    count++;
                }
                while(head1.next!=null && head1.next.data<=head2.data)
                    head1 = head1.next;
                temp = head1.next;
                head1.next = head2;
                head1=temp;
            }

            else{
                if(count==0){
                    head = head2;
                    count++;
                }
                while(head2.next!=null && head2.next.data<head1.data)
                    head2 = head2.next;
                temp = head2.next;
                head2.next = head1;
                head2=temp;
            }
        }

        return head;
    }
}
