class Solution {
    public boolean validPalindrome(String s) {
        return solve(s, 0, s.length() - 1, 1);
    }

    public boolean solve(String s, int i, int j, int ch) {
        if (i >= j) {
            return true;
        }
        if (s.charAt(i) == s.charAt(j)) {
            return solve(s, i + 1, j - 1, ch);
        }
        if (ch == 0) {
            return false;
        }
        return solve(s, i + 1, j, ch - 1) || solve(s, i, j - 1, ch - 1);
    }
}