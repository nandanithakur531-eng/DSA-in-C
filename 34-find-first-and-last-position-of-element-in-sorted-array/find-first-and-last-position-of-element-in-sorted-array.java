class Solution {
    public int[] searchRange(int[] nums, int target) {
       int first  = firstPos(nums , target);
       int last = lastPos(nums , target);

       return new int[]{first,last};
       
       
    }
    public int firstPos(int[] nums , int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
       
        int idx = -1;
        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] <  target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                idx = mid;
                high = mid -1;
              
            }
        }
        return idx;
    }

     public int lastPos(int[] nums , int target){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int idx = -1;
       
       
        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid] <  target){
                low = mid + 1;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                idx = mid;
                low = mid +1;
              
            }
        }
        return idx;
    }    
}