class Solution {
    public long countBadPairs(int[] nums) {
        HashMap<Integer, Long> mp = new HashMap<>();
        long good=0;
        for(int i=0; i<nums.length; i++){
            good+=mp.getOrDefault(nums[i]-i, 0L);
            mp.put(nums[i]-i, mp.getOrDefault(nums[i]-i, 0L)+1);
        }
        long n=nums.length;
        long total=(long)(n*(n-1)/2);
        System.out.print(total);
        return total-good;
    }
}