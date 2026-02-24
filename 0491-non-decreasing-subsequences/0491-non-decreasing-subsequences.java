class Solution {

    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    void backtrack(int[] nums, int start, List<Integer> temp, List<List<Integer>> ans) {
        if (temp.size() >= 2) {
            ans.add(new ArrayList<>(temp));
        }
        Set<Integer> used = new HashSet<>();
        for (int i = start; i < nums.length; i++) {
            if (used.contains(nums[i]))
                continue;

            if (temp.isEmpty() || nums[i] >= temp.get(temp.size() - 1)) {
                used.add(nums[i]);
                temp.add(nums[i]);
                backtrack(nums, i + 1, temp, ans);
                temp.remove(temp.size() - 1);
            }
        }
    }
}