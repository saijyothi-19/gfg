/* Structure of linked list node
class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    Node compute(Node head) {
        int max = Integer.MIN_VALUE;
        
        Node head1 = reverseLL(head);
        Node prev = new Node(-1);
        prev.next = head1;
        Node curr = head1;
        
        while(curr!=null) {
            if(curr.data >= max) {
                max = Math.max(max, curr.data);
                curr = curr.next;
                prev = prev.next;
            } else {
                prev.next = curr.next;
                curr = curr.next;
            }
        }
        
        head = reverseLL(head1);
        
        return head;
    }
    
    Node reverseLL(Node head) {
        Node prev = null;
        Node curr = head;
        
        while(curr!=null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        
        return prev;
    }
}

