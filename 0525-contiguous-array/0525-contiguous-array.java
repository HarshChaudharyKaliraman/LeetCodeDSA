class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0, -1);
        
        int sum=0;
        int maxln=0;

        for(int i=0; i<nums.length; i++){
            sum+= ((nums[i]==1)?1:-1);

            if(map.containsKey(sum)){
                maxln=Math.max(maxln, i-(map.get(sum)));
            }else{
                map.put(sum, i);
            }
        }
        return maxln;
    }
}