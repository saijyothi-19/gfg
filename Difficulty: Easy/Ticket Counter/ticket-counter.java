class Solution {
    static class Node {
        int data;
        Node next, prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static int distributeTicket(int n, int k) {
        if (n == 0 || k == 0) return 0;

        Node front = new Node(1);
        Node temp = front;
        for (int i = 2; i <= n; i++) {
            Node newNode = new Node(i);
            temp.next = newNode;
            newNode.prev = temp;
            temp = newNode;
        }
        Node rear = temp;

        boolean fromFront = true;

        while (front != rear) {
            int count = 0;
            if (fromFront) {
                while (count < k && front != rear) {
                    front = front.next;
                    count++;
                }
            } else {
                while (count < k && front != rear) {
                    rear = rear.prev;
                    count++;
                }
            }
            fromFront = !fromFront;
        }

        return front.data;
    }
}