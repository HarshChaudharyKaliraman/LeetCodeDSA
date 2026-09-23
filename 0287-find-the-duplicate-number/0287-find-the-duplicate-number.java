class Solution {
    public int findDuplicate(int[] nums) {
        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j<nums.length; j++){
        //         if(i!=j && (nums[i] ^ nums[j])==0){
        //             return nums[i];
        //         }
        //     }
        // }
        // return 0;
        
        int count[] = new int[nums.length+1];
        for(int i:nums){
            count[i]++;
            if(count[i]>1){
                return i;
            }
        }
        return 0;
    }
}