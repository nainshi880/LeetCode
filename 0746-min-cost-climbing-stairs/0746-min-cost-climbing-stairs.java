class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return Math.min(climb(0,cost),climb(1,cost));
    }
    public static int climb(int i,int[] arr){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i] != -1) return dp[i];
        return dp[i] = arr[i] + Math.min(climb(i+1,arr),climb(i+2,arr));
    }
}