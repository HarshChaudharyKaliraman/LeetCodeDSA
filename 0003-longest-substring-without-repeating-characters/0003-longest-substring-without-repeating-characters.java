class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            int arr[] = new int[256];
            int count=0;
            for(int j=i; j<s.length(); j++){
                if(arr[s.charAt(j)]==1){
                    ans=Math.max(ans, count);
                    break;
                }else{
                    count+=1;
                    arr[s.charAt(j)]=1;
                }
            }
            ans=Math.max(ans, count);
        }
        return ans;
    }
}