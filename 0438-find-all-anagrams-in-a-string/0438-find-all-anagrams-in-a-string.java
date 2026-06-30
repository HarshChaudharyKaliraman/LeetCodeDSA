class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int l = 0;
        List<Integer> li = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            freq2[p.charAt(i) - 'a']++;
        }
        for (int r = 0; r < s.length(); r++) {
            freq1[s.charAt(r) - 'a']++;
            if (r - l + 1 == p.length()) {
                if (Arrays.equals(freq1, freq2)) {
                    li.add(l);
                }
                freq1[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return li;
    }
}