class Solution {
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;
       
        for(int i=0 ; i<n ; i++){
            boolean[] rowVisited = new boolean[n+1];
            boolean[] colVisited = new boolean[n+1];
            for(int j=0 ; j<n ; j++){
                int rowVal = matrix[i][j];
                int colVal = matrix[j][i];

                if(rowVisited[rowVal]){
                    return false;
                }
                rowVisited[rowVal] = true;

                if(colVisited[colVal]){
                    return false;
                }
                colVisited[colVal] = true;
            }
        }
        return true;
    }
}