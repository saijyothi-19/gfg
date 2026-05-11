class Solution {
    public static int findEquilibrium(int arr[]) {
        //Find Length of the Array
        int n=arr.length;
        //Find Total Sum
        int TotalSum=0;
        for(int i:arr)
        {
            TotalSum+=i;
        }
        //core-logic
        /*If the point is equilibrium then remove that from totalsum and find sum for it till 
        the left of that point and it is the double of the totalsum*/
        //Assign currSum=0;
        int currSum=0;
        for(int j=0;j<n;j++)
        {
            if(TotalSum-arr[j]==2*currSum)
            {
                return j;
            }
            currSum+=arr[j];
        }
        //Iterate through and if nothing found then no equilibrium point
        return -1;
        // code here
        
    }
}