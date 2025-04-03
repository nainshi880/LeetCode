class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long max = 0;

        long[] maxLeft = new long[n];
        maxLeft[0] = nums[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], nums[i]);
        }

        long[] maxSuff = new long[n];
        maxSuff[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxSuff[i] = Math.max(maxSuff[i + 1], nums[i]);
        }

        for (int j = 1; j < n - 1; j++) {
            long value = (maxLeft[j - 1] - nums[j]) * maxSuff[j + 1];
            max = Math.max(max, value);
        }

        return max;
    }
}