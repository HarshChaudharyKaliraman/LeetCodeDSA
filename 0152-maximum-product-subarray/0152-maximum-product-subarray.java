class Solution {
    public int maxProduct(int[] nums) {
        int mul=1;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            mul=1;
            for(int j=i; j<nums.length; j++){
                mul*=nums[j];
                max=Math.max(max, mul);
            }
        }
        return max;
    }
}