class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
    
        for(int i=0 ; i<word.length() ; i++){
            Set<Character>vowels = new HashSet<>();
            for(int j=i ; j<word.length(); j++){
                char ch = word.charAt(j);
                  if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels.add(ch);
                    
                    if(vowels.size() == 5){
                        count++;
                    }
                }
                else{
                    break;
                }
            }
          
        }
        return count;
    }
}