/*
For a given singly linked list of integers,
arrange the elements such that all the even numbers are placed after the odd numbers.
 The relative order of the odd and even terms should remain unchanged.
 */

package LinkedList.src;

public class EvenAfterOdd {

    public static Node<Integer> evenAfterOdd(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null)
            return head;

        Node<Integer> oddPointer = null, evenPointer = null, oddHead = null, evenHead=null;

        while(head!=null){
            if(head.data%2==0){
                if(oddHead==null){
                    oddHead = head;
                    head=head.next;
                    oddPointer=oddHead;
                    oddPointer.next = null;
                }
                else{
                    oddPointer.next = head;
                    oddPointer=head;
                    head=head.next;
                    oddPointer.next = null;
                }
            }
            else{
                if(evenHead==null){
                    evenHead = head;
                    head=head.next;
                    evenPointer=evenHead;
                    evenPointer.next = null;
                }
                else{
                    evenPointer.next = head;
                    evenPointer=head;
                    head=head.next;
                    evenPointer.next = null;
                }
            }
        }
        if(oddHead==null)
            return evenHead;
        else if(evenHead ==null)
            return oddHead;
        else{
            evenPointer.next = oddHead;
            return evenHead;
        }
    }
}
