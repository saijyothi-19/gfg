import java.util.Stack;

class myQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // Enqueue element
    void enqueue(int x) {
        s1.push(x);
    }

    // Dequeue element
    void dequeue() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (!s2.isEmpty()) {
            s2.pop();
        }
    }

    // Get front element
    int front() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }

        if (s2.isEmpty()) return -1;

        return s2.peek();
    }

    // Get size
    int size() {
        return s1.size() + s2.size();
    }
}

