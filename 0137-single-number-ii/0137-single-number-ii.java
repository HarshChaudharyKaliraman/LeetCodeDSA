class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        int i=0;
        while(i<32){
            int count=0;
            for(int e : nums){
                int t = (1<<i);
                if((e&t)!=0){
                    count++;
                }
            }
            if(count%3!=0){
                ans=ans|(1<<i);
            }
            i++;
        }
        return ans;
    }
}