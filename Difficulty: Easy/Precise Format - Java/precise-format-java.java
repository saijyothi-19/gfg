class Solution {
    // Function to return an ArrayList with exact result and formatted result
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        // code here
        ArrayList<Float> result=new ArrayList<>();
     float c=a/b;
      
        float rounded = Math.round(c * 1000) / 1000.0f;
        result.add(c);
        result.add(rounded);
        return result;
        
    }
}