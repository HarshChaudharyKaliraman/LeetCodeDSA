class Solution {
    public long wonderfulSubstrings(String word) {
        long ans = 0;
        long seenBinary[] = new long[1024];
        int mask = 0;
        seenBinary[0] = 1;
        for(char c : word.toCharArray()){
            int binary = 1<<(c-'a');
            mask^=binary;
            ans+=seenBinary[mask];
            for(int i=0; i<10; i++){
                int newbinary = 1<<i;
                ans+=seenBinary[mask^newbinary];
            }
            seenBinary[mask]++;
        }
        return ans;
    }
}