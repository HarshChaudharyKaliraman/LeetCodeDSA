class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0, r=0;
        int sum=nums[0];
        int min = Integer.MAX_VALUE;
        while(r<nums.length){
            if(sum>=target){
                min=Math.min((r-l)+1, min);
                sum-=nums[l];
                l++;
            }else{
                r++;
                if(r<nums.length){
                    sum+=nums[r];
                }
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}