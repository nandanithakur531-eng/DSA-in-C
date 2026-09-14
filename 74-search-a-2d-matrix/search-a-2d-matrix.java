class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
    
        int i = 0;
        int j = (m*n) - 1;

        while(i<=j){
            int mid = (i+j)/2 ;
            int row = mid/n;
            int col = mid%n;

            if(target > matrix[row][col]){
               i = mid+1;
            }else if(target < matrix[row][col]){
               j = mid -1;
            }else{
                return true;
            }
        
        }
    return false;
    }
}
