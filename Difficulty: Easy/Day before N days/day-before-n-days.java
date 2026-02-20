class Solution {
    public static int nthDay(int d, int n) {
          int back = n % 7;
        int result = (d - back + 7) % 7;
        
        return result;
    }
}

