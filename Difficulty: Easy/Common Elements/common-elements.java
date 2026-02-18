class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
        HashMap<Integer,Integer> map= new HashMap<> ();
        ArrayList<Integer> list = new ArrayList<> ();
        for(int x : a)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
         
         for(int y :b)
         {
             if(map.containsKey(y) && map.get(y)>0)
             {
                 list.add(y);
                 map.put(y,map.get(y)-1);
             }
         }
         Collections.sort(list);
         return list;
         
        
    }
}