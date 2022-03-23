/*
You have been given a singly linked list of integers, an integer value called 'data' and a position with the name 'pos.'
 Write a function to add a node to the list with the 'data' at the specified position, 'pos.'
 */

public class InsertNode {
    public static Node<Integer> insert(Node<Integer> head, int pos, int data){
        //Your code goes here
        Node<Integer> node = new Node<>(data);

        if(pos == 0){
            node.next = head;
            head = node;
            return head;
        }
        else
        {
            Node<Integer> temp = head;
            int currIndex = 0;
            while(currIndex<pos-1 && temp.next!=null)
            {
                temp=temp.next;
                currIndex+=1;
            }
            if(currIndex<pos-1)
                return head;
            node.next = temp.next;
            temp.next = node;
            return head;
        }
    }
}
