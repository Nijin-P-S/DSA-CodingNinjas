/*
You have been given a singly linked list of integers along with an integer 'N'. Write a function to
append the last 'N' nodes towards the front of the singly linked list and returns the new head to the list.
 */

public class AppendLastNToFirst {
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {
        //Your code goes here
        if(head == null || n==0 ||head.next==null)
            return head;

        Node<Integer> toFindLength = head;
        int length=1;
        while(toFindLength.next!=null){
            length++;
            toFindLength = toFindLength.next;
        }

        if(n>=length)
            return head;

        Node<Integer> prev = head;


        for(int i=1;i<length-n;i++){
            prev = prev.next;
        }
        Node<Integer> temp = prev.next;

        prev.next = null;

        Node<Integer> newHead = temp;

        while(temp.next!=null)
            temp=temp.next;

        temp.next =head;
        head=newHead;
        return head;
    }
}
