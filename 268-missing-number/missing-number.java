class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; 
        //sum = n(n+1)/2 
        //diff = sum - sum(arr)
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for(int i=0 ; i<n ; i++){
            arrSum = arrSum+nums[i];
        }
        return sum - arrSum;

    }
}