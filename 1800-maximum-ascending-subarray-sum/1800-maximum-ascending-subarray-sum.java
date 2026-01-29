class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int max2=0;
        int result=0;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                max=max+nums[i];
            }else{
                if(max2>result){
                    result=max2;
                }else if(max>result){
                    result=max;
                }
                max2=max;
                max=nums[i];
            }
        }
        if(max2>result){
            result=max2;
        }else if(max>result){
            result=max;
        }
        return result;
    }
}