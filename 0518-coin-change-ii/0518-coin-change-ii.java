class Solution {
    public int change(int a, int[] c) {
        int[]dp = new int[a+1];
        dp[0] = 1;
        for(int coin : c){
            for(int i=coin;i<=a;i++){
              dp[i] += dp[i-coin];
            }
        }
        return dp[a];
    }
}