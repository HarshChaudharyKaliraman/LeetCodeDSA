class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<String>();

        if(nums.length==0){
            return ans;
        }
        int check=nums[0];
        int start=nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=check){
                if(start!=nums[i-1]){
                    ans.add(start+"->"+nums[i-1]);
                }else if(start==nums[i-1]){
                    ans.add(Integer.toString(start));
                }
                check=nums[i];
                start=nums[i];
            }
            check++;
        }
        if(start!=nums[nums.length-1]){
            ans.add(start+"->"+nums[nums.length-1]);
        }else if(start==nums[nums.length-1]){
            ans.add(Integer.toString(start));
        }
        return ans;
    }
}