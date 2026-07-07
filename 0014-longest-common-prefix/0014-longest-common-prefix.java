class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        int w=strs[0].length();
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<w; i++){
            for(int j=1; j<n; j++){
                if(i==strs[j].length() || strs[0].charAt(i)!=strs[j].charAt(i)){
                    return ans.toString();
                }
            }
            ans.append(strs[0].charAt(i));
        }
        return ans.toString();
    }
}