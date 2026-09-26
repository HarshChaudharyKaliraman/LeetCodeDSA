class Solution {
    public int findGCD(int[] nums) {
        int s = Integer.MAX_VALUE;
        int l = Integer.MIN_VALUE;

        for(int i:nums){
            if(i<s){
                s=i;
            }
        }
        for(int i:nums){
            if(i>l){
                l=i;
            }
        }

        int rem=0;
        while(s!=0){
            rem=l%s;
            l=s;
            s=rem;
        }
        return l;
    }
}