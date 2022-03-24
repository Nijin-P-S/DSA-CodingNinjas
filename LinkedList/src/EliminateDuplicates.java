/*
You have been given a singly linked list of integers where the elements are sorted in ascending order.
 Write a function that removes the consecutive duplicate values such that the given list only contains unique elements
 and returns the head to the updated list.
 */

package LinkedList.src;

public class EliminateDuplicates {
    public static Node<Integer> removeDuplicates(Node<Integer> head) {
        //Your code goes here

        if(head==null || head.next ==null)
            return head;

//        Approach 1
    /*     Node<Integer> curr = head;
         Node<Integer> temp = head;

         while(curr!=null){
             temp = curr;

             while(temp !=null  && temp.data.equals(curr.data))
                 temp=temp.next;

             curr.next = temp;
             curr=curr.next;
         }
    */

//      Approach 2

    /*    Node<Integer> prev = head;
        Node<Integer> next = head.next;

        while(next!=null){
            if(prev.data.equals(next.data)){
                next=next.next;
            }
            else{
                prev.next = next;
                prev=next;
                next=next.next;
            }
        }
        if(prev.next != next)
            prev.next = null;
    */
        return head;

    }
}
