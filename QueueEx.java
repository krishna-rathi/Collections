import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queueex {
    public static void main (String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(4);
        q.remove();
        System.out.println(q.peek());
        q.offer(5);
        q.poll();
        System.out.println(q.peek());

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.addFirst(2);
        dq.pollLast();
        dq.peek();
        System.out.println(dq);
        dq.poll();
        System.out.println(dq);
    } 
}
