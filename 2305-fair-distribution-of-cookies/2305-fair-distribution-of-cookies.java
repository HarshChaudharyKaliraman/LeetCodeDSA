class Solution {

    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {
        int[] child = new int[k];
        backtrack(0, cookies, child, k);
        return ans;
    }

    void backtrack(int id, int[] cookies, int[] child, int k) {
        if (id == cookies.length) {
            int max = 0;
            for (int c : child) {
                max = Math.max(max, c);
            }
            ans = Math.min(ans, max);
            return;
        }

        int cook = cookies[id];

        for (int i = 0; i < k; i++) {
            child[i] += cook;

            backtrack(id + 1, cookies, child, k);

            child[i] -= cook;
        }
    }
}