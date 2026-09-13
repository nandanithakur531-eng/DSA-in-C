class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int ans = 0;
        for(String s : commands){
            if(s.equals("RIGHT")){
                ans = ans + 1;
            }else if(s.equals("LEFT")){
                ans = ans - 1;
            }else if(s.equals("DOWN")){
                ans = ans + n;
            }else if(s.equals("UP")){
                ans = ans - n;
            }
        }
        return ans;
        
    }
}