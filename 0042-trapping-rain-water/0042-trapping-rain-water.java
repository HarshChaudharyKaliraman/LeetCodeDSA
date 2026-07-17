class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int mleft[] = new int[n];
        int mright[] = new int[n];
        mleft[0]=height[0];
        mright[n-1]=height[n-1];
        int ans=0;
        for(int i=1; i<n; i++){
            mleft[i]=Math.max(mleft[i-1], height[i]);
        }
        for(int i=n-2; i>=0; i--){
            mright[i]=Math.max(mright[i+1], height[i]);
        }
        for(int i=0; i<n; i++){
            if((Math.min(mleft[i], mright[i])-height[i])<=0){
                continue;
            }
            ans+=Math.min(mleft[i], mright[i])-height[i];
        }
        return ans;
    }
}