
class Solution {
    public int minDistance(String w1, String w2) {
        int m = w1.length();
        int n = w2.length();
        if(w1.equals(w2)) return 0;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return edit(m-1,n-1,new StringBuilder(w1),new StringBuilder(w2),dp);
    }
    public static int edit(int i, int j,StringBuilder s1, StringBuilder s2,int [][] dp){
        if(i < 0) return j+1;
        if(j < 0) return i+1;
        if(s1.charAt(i) == s2.charAt(j)) return edit(i-1,j-1,s1,s2,dp);
        if(dp[i][j] != -1) return dp[i][j];
        int replace = 1 + edit(i-1,j-1,s1,s2,dp);
        int remove = 1 + edit(i-1,j,s1,s2,dp);
        int insert = 1 + edit(i,j-1,s1,s2,dp);
         return dp[i][j] = Math.min(replace,Math.min(remove,insert));
    }
}