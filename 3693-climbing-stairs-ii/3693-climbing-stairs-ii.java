class Solution {
    public int climbStairs(int n, int[] c) {
        int []dp = new int[n+1];
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j=1;j<=3;j++){
                if(i - j >= 0 && dp[i - j] != Integer.MAX_VALUE){
                    dp[i] = Math.min(dp[i],dp[i-j] + c[i-1]+j*j);
                }
            }
        }
        return dp[n];
    }
}