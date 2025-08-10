class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;
        List<Integer> al = new ArrayList<>();

        while (top <= bottom && left <= right) {
            
            for (int i = left; i <= right; i++) {
                al.add(matrix[top][i]);
            }
            top++;

            if (top <= bottom) {
                for (int i = top; i <= bottom; i++) {
                    al.add(matrix[i][right]);
                }
                right--;
            }

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    al.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    al.add(matrix[i][left]);
                }
                left++;
            }
        }
        return al;
    }
}