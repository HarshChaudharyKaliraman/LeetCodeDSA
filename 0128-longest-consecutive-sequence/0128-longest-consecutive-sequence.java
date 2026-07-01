class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> mp = new HashSet<>();
        for(int i:nums){
            mp.add(i);
        }
        int ans=1;
        int max=0;
        for(int num : mp){
            if(!mp.contains(num-1)){
                int curr=num;
                ans=1;
                while(mp.contains(curr+1)){
                    ans++;
                    curr++;
                }
                max=Math.max(max, ans);
            }
        }
        return max;
    }
}