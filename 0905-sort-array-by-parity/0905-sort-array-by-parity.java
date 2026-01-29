class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];

        int a=0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==0){
                ans[a]=0;
                a++;
            }
            if(nums[i]%2==0 && nums[i]>1){
                ans[a]=nums[i];
                a++;
            }
        }
        for(int i =0; i<nums.length; i++){
            if(nums[i]==1){
                ans[a]=1;
                a++;
            }
            if(nums[i]%2!=0 && nums[i]>2){
                ans[a]=nums[i];
                a++;
            }
        }
        return ans;
    }
}