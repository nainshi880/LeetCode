class Solution {
    public int climbStairs(int n) {
       int []dp = new int[n+1];
       return helper(dp,n);
    }
    private int helper(int[] dp, int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n] != 0) return dp[n];
        dp[n] = helper(dp,n-1) + helper(dp,n-2);
          return dp[n];
    }
}