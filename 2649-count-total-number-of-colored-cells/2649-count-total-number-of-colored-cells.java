class Solution {
    public long coloredCells(int n) {
        long totalCells = 2L*n*n - 2L*n + 1;
        return totalCells;
    }
}