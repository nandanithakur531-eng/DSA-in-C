class Solution {
    public boolean judgeSquareSum(int c) {
        long a = 0;

        if(c==0) return true;
        
        while(a*a <=c) {
        long low = 1;
        long high = (long)Math.sqrt(c);

        while(low <= high){
            long mid = low + (high - low)/2;

            long sum = a*a + mid*mid;

            if(sum == c){
                return true;
            }else if(sum < c){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        a++;
    }

return false;
}
}