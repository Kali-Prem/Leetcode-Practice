class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length; //row
        int n = matrix[0].length;  //column
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == -1){
                    int max = Integer.MIN_VALUE;
                    for(int k = 0; k < m; k++){
                        max = Math.max(max,matrix[k][j]);
                    }
                    matrix[i][j] = max;
                }
            }
        }
        return matrix;
    }
}