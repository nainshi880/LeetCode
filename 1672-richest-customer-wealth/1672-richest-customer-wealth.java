class Solution {
    public int maximumWealth(int[][] acc) {
         int n = acc.length;
         int max = 0;

         for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<acc[0].length;j++){
            sum += acc[i][j];
            max = Math.max(sum,max);
            }
         }
         return max;
    }
}