class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] arr=new int[nums.length];
        int i = 0;
        int k = 1;
        for(int j=0; j<nums.length; j++){
            if(nums[j]>0){
                arr[i]=nums[j];
                i=i+2;
            }else{
                arr[k]=nums[j];
                k=k+2;
            }
        }
        return arr;
    }
}