class Solution {
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder();
        StringBuilder digits = new StringBuilder();


        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch)){
                letters.append(ch);
            }else{
                digits.append(ch);
               
            }
        }
        int n = letters.length();
        int m = digits.length();

        if(Math.abs(n - m) > 1){
            return "";
        }

        StringBuilder res = new StringBuilder();

        int letterIndex = 0;
        int digitIndex = 0;

        boolean letterTurn = n >= m;
        for(int i=0 ; i<s.length() ; i++){
            if(letterTurn){
                res.append(letters.charAt(letterIndex));
                letterIndex++;
            }else{
                res.append(digits.charAt(digitIndex));
                digitIndex++;
            }
            letterTurn = !letterTurn;
        }
        
        return res.toString();
          
        
    }
}