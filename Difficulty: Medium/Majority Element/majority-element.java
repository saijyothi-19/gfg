class Solution {
    public int majorityElement(int[] arr) {
        int candidate = -1;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

       
        int freq = 0;
        for (int num : arr) {
            if (num == candidate) {
                freq++;
            }
        }

        if (freq > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}

