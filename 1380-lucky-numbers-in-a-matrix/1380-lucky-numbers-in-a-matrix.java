class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            int min = Integer.MAX_VALUE;
            int minCol = -1;
             for (int col = 0; col < mat[i].length; col++) {
                if (mat[i][col] < min) {
                    min = mat[i][col];
                    minCol = col;
                }
            }
              int maxInCol = Integer.MIN_VALUE;

            for (int r = 0; r < mat.length; r++) {
                maxInCol = Math.max(maxInCol, mat[r][minCol]);
            }

            if (min == maxInCol) {
                res.add(min);
            }


        }
        return res;
        
            }
}