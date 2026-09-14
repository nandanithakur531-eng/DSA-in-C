class Solution {
    public void rotate(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;
      
      for(int i=1 ; i<n ; i++){
        for(int j=0 ; j<i ; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
      }
      for(int i=0 ; i<n ; i++){
        int stCol = 0;
        int endCol = m-1;
        while(stCol<endCol){
            int temp = matrix[i][stCol];
            matrix[i][stCol] = matrix[i][endCol];
            matrix[i][endCol] = temp;
            stCol++;
            endCol--;
        }
      }
    }
}