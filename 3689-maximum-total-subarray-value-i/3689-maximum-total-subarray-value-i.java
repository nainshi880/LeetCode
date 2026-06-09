class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long total = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            min = Math.min(min,nums[i]);
        }

        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }

        for(int i=0;i<k;i++){
            total += (max - min);
        }

        return total;

    }
}