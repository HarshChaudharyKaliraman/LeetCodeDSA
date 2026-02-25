class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backtrack(1, n, k);
        return ans;   
    }

    void backtrack(int start, int n, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i = start; i<=n; i++){
            temp.add(i);
            backtrack(i+1, n, k);
            temp.remove(temp.size()-1);
        }
    }
}