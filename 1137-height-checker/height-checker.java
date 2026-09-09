class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for(int i=0; i<heights.length ; i++){
            expected[i] = heights[i];
        }

        int n = expected.length;
        for(int i=0 ; i<n-1 ; i++){
            int swaps=0;
            for(int j=0 ; j<n-i-1 ; j++){
                if(expected[j]>expected[j+1]){
                    int temp = expected[j];
                    expected[j] = expected[j+1];
                    expected[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps==0){
                break;
            }
        }

        int count=0;
        for(int i=0 ; i<heights.length ; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
        
    }
}