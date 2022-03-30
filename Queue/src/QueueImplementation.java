package Queue.src;

public class QueueImplementation {
    Node front;
    Node tail;
    int size=0;

    public QueueImplementation() {
        //Implement the Constructor
        front = null;
        tail=null;
    }

    public int getSize() {
        //Implement the getSize() function
        return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
        //Implement the enqueue(element) function
        Node n = new Node(data);
        if(front==null){
            front = n;
            tail=n;
            n.next = null;
        }
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }


    public int dequeue() {
        //Implement the dequeue() function
        if(front==null)
            return -1;
        int temp = front.data;
        front = front.next;
        size--;
        return temp;
    }


    public int front() {
        //Implement the front() function
        if(front == null)
            return -1;
        else
            return front.data;
    }
}
