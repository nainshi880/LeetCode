class Solution {
    static int [][] dp;
    public int uniquePathsWithObstacles(int[][] ob) {
        int m = ob.length;
        int n = ob[0].length;
         dp = new int[m][n];
        return paths(m-1,n-1,ob);
    }
    public static int paths(int i, int j,int[][] ob){
         if(i < 0 || j < 0) return 0; 
          if(dp[i][j] != 0) return dp[i][j];
          if(ob[i][j] == 1) return 0;
          if(i == 0 && j == 0) return 1;
          return dp[i][j] = paths(i-1,j,ob)+paths(i,j-1,ob);
    }
}