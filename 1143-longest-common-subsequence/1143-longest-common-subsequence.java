class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int m =t1.length();
        int n = t2.length();
        int [][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return LCS(m-1,n-1,new StringBuilder(t1),new StringBuilder(t2),dp);
    }
    public static int LCS(int i, int j,StringBuilder t1, StringBuilder t2,int[][] dp){
        if (i<0 ||j<0) return 0;
        if(dp[i][j] != -1) return dp[i][j];
         if(t1.charAt(i) == t2.charAt(j)) return 1+LCS(i-1,j-1,t1,t2,dp);
         else return dp[i][j] = Math.max(LCS(i-1,j,t1,t2,dp),LCS(i,j-1,t1,t2,dp));
    }
}