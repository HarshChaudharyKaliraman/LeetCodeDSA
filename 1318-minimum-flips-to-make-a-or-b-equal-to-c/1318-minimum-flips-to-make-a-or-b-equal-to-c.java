class Solution {
    public int minFlips(int a, int b, int c) {
        int flip=0;
        int x = 0;
        int y = 0;
        int z = 0;
        for(int i=0; i<32; i++){
            x=(a >> i) & 1;
            y=(b >> i) & 1;
            z=(c >> i) & 1;
            if(z==1){
                if(x==0 && y==0){
                    flip++;
                }
            }else{
                flip += x+y;
            }
        }
        return flip;
    }
}