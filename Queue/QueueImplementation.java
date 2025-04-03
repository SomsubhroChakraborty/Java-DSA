package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementation {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Enqueue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        // Dequeue
        queue.remove(); //remove 1
        queue.remove(); //remove 2
        queue.remove(); //remove 3

        System.out.println(queue.poll()); //print 4
        System.out.println(queue.poll()); //print 5

    }
}
