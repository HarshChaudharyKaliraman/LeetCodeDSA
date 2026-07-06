class Solution {
    public boolean isPalin(String s, int i, int j, Boolean dp[][]){
        if(i>=j){
            return true;
        }
        if(dp[i][j] != null){
            return dp[i][j];
        }
        if(s.charAt(i)!=s.charAt(j)){
            return dp[i][j] = false;
        }
        return dp[i][j] = isPalin(s, i+1, j-1, dp);
    }
    public String longestPalindrome(String s) {
        int start=0;
        int max=1;
        int n=s.length();
        Boolean dp[][] = new Boolean[n][n];
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                if(isPalin(s, i, j, dp)){
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