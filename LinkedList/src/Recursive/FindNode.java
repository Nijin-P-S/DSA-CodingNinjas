/*
Given a singly linked list of integers and an integer n,
find and return the index for the first occurrence of 'n' in the linked list. -1 otherwise.
Follow a recursive approach to solve this.
 */

package LinkedList.Recursive;

public class FindNode {
    public static int findNodeRec(Node<Integer> head, int n, int count) {
        //Your code goes here
        if(head ==null)
            return -1;

        if(head.data == n)
            return count;

        return findNodeRec(head.next, n, count+1);
    }

    public static int findNodeRec(Node<Integer> head, int n) {
        //Your code goes here
        return findNodeRec(head, n, 0);
    }
}
