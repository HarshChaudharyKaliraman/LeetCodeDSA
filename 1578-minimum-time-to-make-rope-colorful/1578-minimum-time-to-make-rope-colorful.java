class Solution {
    public int minCost(String colors, int[] neededTime) {
        int p=neededTime[0];
        int time=0;
        for(int i=1; i<colors.length(); i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                time+=Math.min(neededTime[i], p);
                p=Math.max(p, neededTime[i]);;
            }else{
                p=neededTime[i];
            }
        }
        return time; 
    }
}