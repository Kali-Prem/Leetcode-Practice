class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        LinkedHashSet<Integer> newRow = new LinkedHashSet<>();
        LinkedHashSet<Integer> newCol = new LinkedHashSet<>(); //linkedhashset maintain the insetion order

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    newRow.add(i);
                    newCol.add(j);

                }
            }
        }
        // making Rows wise 0
        for (int x : newRow) {
            for (int j = 0; j < m; j++) {
                matrix[x][j] = 0;
            }
        }
        // making Colums wise 0
        for (int x : newCol) {
            for (int i = 0; i < n; i++) {
                matrix[i][x] = 0;

            }
        }
    }
}