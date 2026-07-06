class Solution {
    public boolean isPalin(String s, int i, int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalin(s, i+1, j-1);
    }
    public String longestPalindrome(String s) {
        int start=0;
        int max=1;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalin(s, i, j)){
                    if(j-i+1>=max){
                        max=j-i+1;
                        start=i;
                    }
                }
            }
        }
        return s.substring(start, start+max);
    }
}