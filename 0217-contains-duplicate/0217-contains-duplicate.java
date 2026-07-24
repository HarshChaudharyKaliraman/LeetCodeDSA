class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i:nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        for(int i:nums){
            if(mp.get(i)>=2){
                return true;
            }
        }
        return false;
    }
}