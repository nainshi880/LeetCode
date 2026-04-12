class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n+1;j++){
                dp[i][j] = -1;
            }
        }
        return helper(0,-1,nums,dp);
    }
    public static int helper(int i,int pre,int[] nums,int[][] dp){
        if(i == nums.length) return 0;
        if(dp[i][pre+1] != -1) return dp[i][pre+1];
        int skip = helper(i+1,pre,nums,dp);
        if(pre != -1 && nums[pre] >= nums[i]){
            return skip;
        }
         int pick = 1+ helper(i+1,i,nums,dp);
        return dp[i][pre+1] = Math.max(pick,skip);
    }
}