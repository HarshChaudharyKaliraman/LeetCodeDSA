class Solution {
    public int minOperations(int[] nums, int k) {
        int ans=0;
        for(int e : nums){
            ans^=e;
        }
        return Integer.bitCount(ans^k);
    }
}