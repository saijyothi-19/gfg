class Geeks {
    static void enqueue(Queue<Integer> q, int k) {
        //  code here
        q.offer(k);
    }

    static int findFrequency(Queue<Integer> q, int k) {

        int count=0;
        for(int i:q){
            
            if(i==k){
                count++;
                // System.out.print(i+" - ");
            }
        }
        
        return count;
        //  code here
    }
}