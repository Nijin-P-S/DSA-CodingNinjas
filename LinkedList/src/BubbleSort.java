/*
Given a singly linked list of integers, sort it using 'Bubble Sort.'
 */
package LinkedList;

public class BubbleSort {
    public static LinkedListNode<Integer> swap(LinkedListNode<Integer> prev, LinkedListNode<Integer> curr, LinkedListNode<Integer> next){
        if(prev == null){
            curr.next = next.next;
            next.next = curr;
        }
        else{
            prev.next = next;
            curr.next = next.next;
            next.next = curr;
        }

        return next;
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head==null || head.next == null)
            return head;
        int length = 0;
        LinkedListNode<Integer> tail = head;

        while(tail != null)
        {
            length++;
            tail = tail.next;
        }

        for(int i = 0; i < length-1; i++){
            LinkedListNode<Integer> prev = null, curr = head, next = curr.next;

            for(int j=0;j < length-i-1; j++){
                if(curr.data > next.data){
                    if(prev == null){
                        head = swap(prev, curr, next);
                        prev = head;
                        curr = prev.next;
                        next = curr.next;
                    }
                    else{
                        prev = swap(prev, curr, next);
                        curr = prev.next;
                        next = curr.next;
                    }
                }
                else{
                    prev = curr;
                    curr = curr.next;
                    next = curr.next;
                }
            }
        }
        return head;
    }
}
