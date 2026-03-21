class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int m = grid.length;
        int n = grid[0].length;
                  int low = x;
                  int high = x+k-1;
                  while(low < high){
                  for(int i=y;i<(y+k);i++){
                    int temp = grid[low][i];
                    grid[low][i] = grid[high][i];
                    grid[high][i] = temp;
                  }
                  low++;
                  high--;
            }
        
        return grid;
    }
}