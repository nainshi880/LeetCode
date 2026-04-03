class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for(int i = 0; i < m; i++){
            if(grid[i][0] == 0){
                for(int j = 0; j < n; j++){
                    grid[i][j] ^= 1;
                }
            }
        }

        for(int j = 1; j < n; j++){

            int ones = 0;

            for(int i = 0; i < m; i++){
                if(grid[i][j] == 1) ones++;
            }

            if(ones < m - ones){
                for(int i = 0; i < m; i++){
                    grid[i][j] ^= 1;
                }
            }
        }

        int res = 0;

        for(int i = 0; i < m; i++){
            int num = 0;

            for(int j = 0; j < n; j++){
                num = num * 2 + grid[i][j];
            }

            res += num;
        }
        return res;
    }
}