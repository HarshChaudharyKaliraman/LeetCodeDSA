class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if(nums.length==0){
            return ans;
        }

        int point = nums[0];
        int a=nums[0];
        int b=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]==point){
                b=nums[i];
            }else{
                if(a==b){
                    ans.add(Integer.toString(a));
                }else{
                    ans.add((Integer.toString(a))+"->"+(Integer.toString(b)));
                }
                a=nums[i];
                i--;
                point=a;
                point--;
            }
            point++;
        }
        if(a==b){
            ans.add(Integer.toString(a));
        }else{
            ans.add((Integer.toString(a))+"->"+(Integer.toString(b)));
        }
        return ans;
    }
}