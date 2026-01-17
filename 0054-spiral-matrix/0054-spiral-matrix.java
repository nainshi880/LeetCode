class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> arr = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        int minRow = 0, minCol = 0;
        int maxRow = rows - 1, maxCol = cols - 1;

        while (minRow <= maxRow && minCol <= maxCol) {

            for (int c = minCol; c <= maxCol; c++) {
                arr.add(matrix[minRow][c]);
            }
            minRow++;

            for (int r = minRow; r <= maxRow; r++) {
                arr.add(matrix[r][maxCol]);
            }
            maxCol--;

            if (minRow <= maxRow) {
                for (int c = maxCol; c >= minCol; c--) {
                    arr.add(matrix[maxRow][c]);
                }
                maxRow--;
            }

            if (minCol <= maxCol) {
                for (int r = maxRow; r >= minRow; r--) {
                    arr.add(matrix[r][minCol]);
                }
                minCol++;
            }
        }

        return arr;
    }

}