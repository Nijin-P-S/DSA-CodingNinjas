package Queue.src;


import sun.misc.Queue;

import java.util.Scanner;

public class FibonacciUsingQueue {
    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(0);
        queue.enqueue(1);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++)
        {
            int a = queue.dequeue();
            int b = queue.dequeue();
            queue.enqueue(b);
            queue.enqueue(a + b);
            System.out.print(a+" ");
        }
    }

}
