class Solution {
    int ans = Integer.MIN_VALUE;

    public int maximumRequests(int n, int[][] requests) {
        int resultant[] = new int[n];
        backtrack(0, 0, n, resultant, requests);
        return ans;
    }

    void backtrack(int id, int count, int n, int resultant[], int[][] requests) {
        if (id == requests.length) {
            boolean allzero = true;
            for (int c : resultant) {
                if (c != 0) {
                    allzero = false;
                    break;
                }
            }
            if (allzero)
                ans = Math.max(ans, count);
            return;
        }

        int from = requests[id][0];
        int to = requests[id][1];

        resultant[from]--;
        resultant[to]++;
        backtrack(id + 1, count + 1, n, resultant, requests);

        resultant[from]++;
        resultant[to]--;

        backtrack(id + 1, count, n, resultant, requests);
    }
}