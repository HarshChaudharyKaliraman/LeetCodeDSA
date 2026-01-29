class Solution {
    public int pivotIndex(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int lsum=0;
            int rsum=0;
            for(int a=0; a<i; a++){
                lsum=lsum+nums[a];
            }
            for(int b=i+1; b<nums.length; b++){
                rsum=rsum+nums[b];
            }
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
}