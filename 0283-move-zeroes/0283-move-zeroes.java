class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                if(nums[j-1]==0 && nums[j]!=0){
                    nums[j-1]=nums[j];
                    nums[j]=0;
                }
            }
        }
    }
}