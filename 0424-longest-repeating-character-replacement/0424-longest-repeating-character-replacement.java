class Solution {
    public int characterReplacement(String s, int k) {
        int l=0; 
        int r=0;
        int arr[] = new int[26];
        int max=0;
        int ans=0;
        while(r<s.length()){
            arr[s.charAt(r)-'A']++;
            max=Math.max(max, arr[s.charAt(r)-'A']);

            while((r-l+1)-max>k){
                arr[s.charAt(l)-'A']--;
                l++;
            }
            ans=Math.max(ans, (r-l+1));
            r++;
        }
        return ans;
    }
}