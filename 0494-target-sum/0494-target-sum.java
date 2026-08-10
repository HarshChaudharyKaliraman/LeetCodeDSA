class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int to=0;
        for(int i:nums){
            to+=i;
        }
        int dp[][] = new int[nums.length][2*to+1];
        for(int row[] : dp){
            Arrays.fill(row, -1);
        }
        return solve(nums, target, 0, 0, dp, to);
    }
    int solve(int arr[], int target, int sum, int i, int dp[][], int to){
        if(i==arr.length){
            return sum==target?1:0;
        }
        if(dp[i][sum+to]!=-1){
            return dp[i][sum+to];
        }
        int plus=solve(arr, target, sum+arr[i], i+1, dp, to);
        int minu=solve(arr, target, sum-arr[i], i+1, dp, to);
        return dp[i][sum+to]=plus+minu;
    }
}