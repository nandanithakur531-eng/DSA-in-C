class Solution {
    public int[][] generateMatrix(int n) {

      int[][] ans = new int[n][n];

      int dim = n*n;
      int count = 1;

      if(count <= dim){
      int top = 0;
      int bottom = ans.length -1;
      int left = 0;
      int right = ans[0].length - 1;

      while(top<=bottom && left<=right){
        for(int j = left ; j<=right ; j++){
            ans[top][j] = count++;
        } 
        top++;

        for(int i=top ; i<= bottom ; i++){
            ans [i][right] = count++;
        }
        right--;

        if(top<=bottom){
            for(int j=right ; j>=left ; j--){
                ans[bottom][j] = count++;
            }
            bottom--;

        }
        if(left <= right){
            for(int i=bottom ; i>=top ; i--){
                ans[i][left] = count++;
            }
            left++;
        }
      }
      }
        return ans;
        
    }
}