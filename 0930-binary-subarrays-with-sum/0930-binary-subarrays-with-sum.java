class Solution 
{
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        HashMap <Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int ans=0;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum += nums[i];
            if(sum == goal)
                ans++;
            if((hm.containsKey(sum-goal)))
            {
                ans += hm.get(sum-goal);
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
            else
            {
                hm.put(sum,hm.getOrDefault(sum,0)+1);
            }
        }
        
        return ans;
    }
}