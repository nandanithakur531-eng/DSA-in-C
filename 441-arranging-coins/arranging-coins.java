class Solution {
  
    public int sqrt(long x){
        return (int) Math.sqrt((long)x);
    }
      public int arrangeCoins(int n) {
        long m = (long) n;
        return (sqrt(8*m+1) - 1)/2;
        
    }
    
}