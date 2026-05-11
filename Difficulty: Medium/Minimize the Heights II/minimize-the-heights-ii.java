class Solution {
    public int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (n == 1) return 0;
        Arrays.sort(arr);
        int answer = arr[n - 1] - arr[0];
        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(arr[0] + k, arr[i + 1] - k);
            int max = Math.max(arr[n - 1] - k, arr[i] + k);
            if (min < 0) continue;
            answer = Math.min(answer, max - min);
        }
        return answer;
    }
}  