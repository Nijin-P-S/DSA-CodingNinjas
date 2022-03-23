import java.util.Scanner;

public class TakeInput {

    public static Node<Integer> createNode(int data){
        Node<Integer> n1 = new Node<>(data);
        return n1;
    }

    public static Node<Integer> getInput(){
        Scanner input = new Scanner(System.in);
        int i=0;
        Node<Integer> head= null;
        Node<Integer> tail =null;
        while(i!=-1){
            i = input.nextInt();
            if(i==-1){
                break;
            }
            else{
                Node<Integer> next = createNode(i);
                if(head==null && tail==null){
                    head = next;
                    tail=head;
                }
                else{
                    tail.next = next;
                    tail = tail.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = getInput();

        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
