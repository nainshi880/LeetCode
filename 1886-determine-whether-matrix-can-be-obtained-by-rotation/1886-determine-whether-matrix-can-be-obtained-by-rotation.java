class Solution {

     private int[][] rotate(int[][] mat){
        int n = mat.length;
       int[][]res = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              res[n-1-j][i] = mat[i][j];

            }
        }
        return res;
    }
   
    public boolean findRotation(int[][] mat, int[][] target) {
       for(int i=0;i<4;i++){
        
         if(Arrays.deepEquals(mat,target)) {
            return true;
         }
        mat = rotate(mat);
        
       }
       return false;
    }
 }

       