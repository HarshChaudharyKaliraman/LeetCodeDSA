class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];

        int i=0;
        for(int in : nums){
            ans[i]=in;
            i++;
        }
        for(int in : nums){
            ans[i]=in;
            i++;
        }

        return ans;
    }
}