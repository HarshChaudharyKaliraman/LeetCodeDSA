class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mul=1;
        int czero=0;
        int ans[] = new int[nums.length];
        for(int i: nums){
            if(i!=0){
                mul*=i;
            }else{
                czero++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0 && czero>0){
                ans[i]=0;
            }else if(nums[i]!=0 && czero==0){
                ans[i]=mul/nums[i];
            }else if(nums[i]==0 && czero==1){
                ans[i]=mul;
            }else if(nums[i]==0 && czero>1){
                ans[i]=0;
            }
        }
        return ans;
    }
}