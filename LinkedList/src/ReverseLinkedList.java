/*
You have been given a singly linked list of integers. Write a function to print the list in a reverse order.
 To explain it further, you need to start printing the data from the tail and move towards the head of the list,
  printing the head data at the end.
*/

package LinkedList.src;

public class ReverseLinkedList {

    public static void printReverse(Node<Integer> node) {
        //Optimal Solution

     /*    Node<Integer> prev = null;
         Node<Integer> current = node;
         Node<Integer> next = null;
         while (current != null) {
             next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         node = prev;
     */

        
         //Naive approach

    /*    if(node==null)
            return;

        Node<Integer> prev = new Node<>(node.data);

        node=node.next;

        while(node!=null){
            Node<Integer> next = new Node<>(node.data);
            next.next = prev;
            prev=next;
            node=node.next;
        }

        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }

     */
    }
}
