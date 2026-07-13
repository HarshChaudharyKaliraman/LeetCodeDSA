class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        solve(candidates, target, 0, temp, ans);
        return ans;
    }
    void solve(int[] candidates, int target, int start, List<Integer> temp, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList(temp));
            return;
        }
        for(int i=start; i<candidates.length; i++){
            if(candidates[i]>target){
                continue;
            }
            temp.add(candidates[i]);
            solve(candidates, target-candidates[i], i, temp, ans);
            temp.remove(temp.size()-1);
        }
    }
}