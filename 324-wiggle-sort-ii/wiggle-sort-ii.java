class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);

        int[] clone = nums.clone();
        int left =(n-1)/2;
        int right = n-1;
        for(int i=0 ; i<n ; i++){
            if(i%2==0){
               nums[i]= clone[left];
               left--;
            }else{
             nums[i] = clone[right];
             right--;
            }
        }
    }
}