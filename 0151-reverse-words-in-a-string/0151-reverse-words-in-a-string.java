class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n=s.length();
        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0){
                break;
            }
            int start=i;
            while(start>=0 && s.charAt(start)!=' '){
                start--;
            }
            if(ans.length()>0){
                ans.append(' ');
            }
            ans.append(s.substring(start+1, i+1));
            i=start-1;
        }
        return ans.toString();
    }
}