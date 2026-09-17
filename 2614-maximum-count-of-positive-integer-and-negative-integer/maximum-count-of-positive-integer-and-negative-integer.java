class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;

        int pos = 0 ;
        int neg = 0;

        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low + high)/2 ;
            if(nums[mid]<0){
                neg = mid + 1;
                low = mid + 1;;
            }else {
                high = mid - 1;
            }
            }

            int low1 = 0 ;
            int high1 = n-1;

            while(low1 <= high1){
            int mid = (low1 + high1)/2 ;
            if(nums[mid]>0){
                pos = n - mid;
                high1 = mid - 1;;
            }else {
                low1 = mid + 1;
            }
            }
        
        if(pos > neg){
            return pos;
        }else{
            return neg;
        }
        
    }
}