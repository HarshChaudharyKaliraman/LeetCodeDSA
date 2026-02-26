class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean vis[] = new boolean[nums.length];
        Arrays.sort(nums);
        solve(vis, nums);
        return ans;
    }

    void solve(boolean vis[], int[] nums) {
        if (temp.size() == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i] == true)
                continue;

            if(i>0 && nums[i]==nums[i-1] && !vis[i-1])
                continue;

            vis[i] = true;
            temp.add(nums[i]);

            solve(vis, nums);

            vis[i] = false;
            temp.remove(temp.size() - 1);
        }
    }
}