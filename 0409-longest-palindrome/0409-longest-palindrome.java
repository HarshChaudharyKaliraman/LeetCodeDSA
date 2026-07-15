class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        int arr[] = new int[58];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'A']+=1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                ans+=arr[i];
            }else{
                ans+=arr[i]-1;
            }
        }
        if(ans==s.length()){
            return ans;
        }else{
            return ans+1;
        }
    }
}