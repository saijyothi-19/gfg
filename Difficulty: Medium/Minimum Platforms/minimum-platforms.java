class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int i = 0;
        int j = 0;
       
        
        int p = 0;
        int maxp = 0;
        
        while (i < arr.length && j < dep.length) {
            
            if(arr[i] <= dep[j]) {
                p++;
                i++;
            }
            
            else {
                p--;
                j++;
            
            }
            maxp = Math.max(maxp , p);
        }

        return maxp;
        
    }
}

