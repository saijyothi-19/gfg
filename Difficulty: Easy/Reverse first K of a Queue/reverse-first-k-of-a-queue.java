class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        //Queue<Integer>q=new Queue<>();
        
        if(k>q.size())return q;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.offer(stack.pop());
        }
        int size=q.size();
        for(int i=0;i<size-k;i++){
            q.offer(q.poll());
        }
        return q; 
    }
}