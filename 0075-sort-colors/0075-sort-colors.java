class Solution {
    public void sortColors(int[] nums) {
        int in=0;
        int temp=0;
        while(in!=nums.length){
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]>nums[i]){
                temp=nums[i-1];
                nums[i-1]=nums[i];
                nums[i]=temp;
            }    
        }
        in++;
        }
    }
}