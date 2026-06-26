class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        for(int i=0; i<words.length; i++){
            for(int j=i; j<words.length; j++){
                if(words[i].charAt(0)==words[j].charAt(1) && words[i].charAt(1)==words[j].charAt(0) && i!=j){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}