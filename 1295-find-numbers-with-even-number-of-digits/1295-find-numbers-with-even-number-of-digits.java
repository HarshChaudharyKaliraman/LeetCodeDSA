class Solution {
    public int findNumbers(int[] nums) {
        int temp=0;
        int ans=0;
        int count=0;
        for(int i=0; i<nums.length; i++){
            count=0;
            temp=nums[i];
            while(temp!=0){
                count++;
                temp=temp/10;
            }
            if(count%2==0){
                ans++;
            }
        }
        return ans;
    }
}