class Solution {
    public int lengthOfLastWord(String s) {
    
        s = s.trim();

        int lastIndex = s.lastIndexOf(" ");

        String lastword = s.substring(lastIndex + 1);

        return lastword.length();
    }
}