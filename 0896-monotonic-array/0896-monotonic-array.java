class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean as=true;
        boolean ds=true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                as=false;
            }
            if(nums[i]>nums[i-1]){
                ds=false;
            }
        }
        if(as==true || ds==true){
            return true;
        }
        return false;
    }
}