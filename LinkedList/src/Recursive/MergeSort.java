package LinkedList.Recursive;

public class MergeSort {
    public static Node<Integer> mergeSort(Node<Integer> head) {
        //Your code goes here
        if(head==null || head.next==null)
            return head;

        Node<Integer> fastPointer=head;
        Node<Integer> normalPointer = head;

        while(fastPointer.next!=null && fastPointer.next.next!=null){
            fastPointer= fastPointer.next.next;
            normalPointer=normalPointer.next;
        }
        Node<Integer> part2Head = normalPointer.next;
        normalPointer.next=null;

        Node<Integer> head1=mergeSort(head);
        Node<Integer> head2=mergeSort(part2Head);

        head = merge(head1, head2);

        return head;
    }

    public static Node<Integer> merge(Node<Integer> part1Head, Node<Integer> part2Head){
        Node<Integer> head, tail;

        if(part1Head==null)
            return part2Head;
        if(part2Head==null)
            return part1Head;

        if(part1Head.data<part2Head.data){
            head=part1Head;
            tail=part1Head;
            part1Head=part1Head.next;
            tail.next=null;
        }

        else{
            head=part2Head;
            tail=part2Head;
            part2Head=part2Head.next;
            tail.next=null;
        }

        while(part1Head!=null && part2Head!=null){
            if(part1Head.data<part2Head.data){
                tail.next=part1Head;
                part1Head=part1Head.next;
                tail=tail.next;
                tail.next=null;
            }
            else{
                tail.next=part2Head;
                part2Head=part2Head.next;
                tail=tail.next;
                tail.next=null;
            }
        }

        if(part1Head!=null)
            tail.next=part1Head;
        if(part2Head!=null)
            tail.next=part2Head;

        return head;
    }
}
