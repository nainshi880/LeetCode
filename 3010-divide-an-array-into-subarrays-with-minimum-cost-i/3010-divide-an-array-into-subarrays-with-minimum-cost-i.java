class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        long ans = Integer.MAX_VALUE;

        int minSec = nums[1];

        for(int j=2;j<n;j++){
            ans = Math.min(ans,nums[0]+minSec+nums[j]);
            minSec = Math.min(minSec,nums[j]);
        }
        return (int)ans;
    }
}