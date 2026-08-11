class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        solve(candidates, target, 0, 0, temp);
        return ans;
    }
    public void solve(int arr[], int target, int i, int sum, List<Integer> temp){
        if(sum==target){
            ans.add(new ArrayList(temp));
            return;
        }
        if(i==arr.length || sum>target){
            return;
        }
        if(arr[i]>target){
            return;
        }
        temp.add(arr[i]);
        solve(arr, target, i+1, sum+arr[i], temp);
        temp.remove(temp.size()-1);
        int next=i+1;
        while(next<arr.length && arr[next]==arr[i]){
            next++;
        }
        solve(arr, target, next, sum, temp);
    }
}