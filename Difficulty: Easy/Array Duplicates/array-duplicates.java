class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            int a= arr[i];
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(int j=0; j< arr.length;j++){
            int b= arr[j];
            if(map.get(b)==2){
                list.add(b);
                map.put(b,0);
            }
        }return list;
    }
}