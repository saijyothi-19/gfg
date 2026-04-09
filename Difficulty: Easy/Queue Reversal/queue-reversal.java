import java.util.*;

class Solution {
    public Queue<Integer> reverseQueue(Queue<Integer> q) {
        if (q.isEmpty()) return q;

        int front = q.poll();   // remove front
        reverseQueue(q);        // reverse remaining
        q.offer(front);         // add at rear

        return q;
    }
}