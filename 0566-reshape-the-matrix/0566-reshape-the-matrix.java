class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
         int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];

        int oldIdx = 0;
        int newIdx = 0;

        while (oldIdx < m * n) {

            ans[newIdx / c][newIdx % c] =
                    mat[oldIdx / n][oldIdx % n];

            oldIdx++;
            newIdx++;
        }

        return ans;

    }
}