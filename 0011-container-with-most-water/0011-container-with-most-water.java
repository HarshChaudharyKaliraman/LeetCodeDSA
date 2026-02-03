class Solution {
    public int maxArea(int[] height) {
        int s=0;
        int l=height.length-1;
        int max=0;
        int temp=0;
        while(s<l){
            temp=(Math.min(height[s], height[l]))*(l-s);
            if(max<temp){
                max=temp;
            }
            if(height[s]<height[l]){
                s++;
            }else{
                l--;
            }
        }
        return max;
    }
}