class Solution {
    public boolean checkZeroOnes(String s) {
        int count0=0;
        int max0=0;
        int count1=0;
        int max1=0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                count0++;
            }else{
                if(count0>max0){
                    max0=count0;
                }
                count0=0;
            }
            if(count0>max0){
                max0=count0;
            }
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count1++;
            }else{
                if(count1>max1){
                    max1=count1;
                }
                count1=0;
            }
            if(count1>max1){
                max1=count1;
            }
        }
        if(max1>max0){
            return true;
        }
        return false;
    }
}