class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0; 
        int r=k-1;
        double sum=0;
        double ans=Integer.MIN_VALUE;
        for(int i=l; i<=r; i++){
            sum+=nums[i];
        }
        while(r<nums.length){
            if((sum/k)>ans){
                ans=sum/k;
            }
            sum-=nums[l];
            l++;
            r++;
            if(r<nums.length){
                sum+=nums[r];
            }
        }
        return ans;
    }
}