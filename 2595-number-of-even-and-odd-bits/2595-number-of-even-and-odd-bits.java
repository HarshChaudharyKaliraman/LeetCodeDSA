class Solution {
    public int[] evenOddBit(int n) {
        int arr[] = new int[2];
        arr[0]=0;
        arr[1]=0;
        int ind=0;
        while(n!=0){
            if((n&1)==0){
                n=n>>1;
                ind++;
            }else{
                if(ind%2==0){
                    arr[0]++;
                }else{
                    arr[1]++;
                }
                n=n>>1;
                ind++;
            }
        }
        return arr;
    }
}