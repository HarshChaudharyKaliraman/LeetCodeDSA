class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        solve(k, n, 1);
        return ans;
    }

    void solve(int k, int n, int start){
        if(k==0 && n==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(k==0 && n!=0){
            return;
        }
        for(int i=start; i<10; i++){
            if(i>n){
                break;
            }
            temp.add(i);
            solve(k-1, n-i, i+1);
            temp.remove(temp.size()-1);
        }
    }
}