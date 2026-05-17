class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
        List<Integer>list=new ArrayList<>();
        
        Stack<Integer>st=new Stack<>();
        
        for(int i=0;i<arr.length;i++){
              if(st.size()==0){
                  st.push(arr[i]);
              }
              else if(st.size()>0 && st.peek()<0 && arr[i]<0){
                   st.push(arr[i]);
              }
              else if(st.size()>0 && st.peek()>=0 && arr[i]>=0){
                   st.push(arr[i]);
              }
              else{
                   st.pop();
              }
        }
        
        while(st.size()>0){
            int x=st.peek();
            st.pop();
            list.add(x);
        }
        
        Collections.reverse(list);
        
        return list;
    }
}

