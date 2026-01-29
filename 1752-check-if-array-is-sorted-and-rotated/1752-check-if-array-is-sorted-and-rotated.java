class Solution {
    public boolean check(int[] nums) {
        for(int a = 0; a<nums.length; a++){
            int temp = nums[0];
            int check = 0;
            for(int i = 0; i<nums.length-1; i++){
                if(nums[i]>nums[i+1]){
                    check=1;
                    break;
                }
            }
            if(check==0){
                return true;
            }
            for(int i = 1; i<nums.length; i++){
                nums[i-1]=nums[i];
            }
            nums[nums.length-1]=temp;
        }
        return false;
    }
}