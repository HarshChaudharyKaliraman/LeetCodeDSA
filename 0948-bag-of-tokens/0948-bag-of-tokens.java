class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int max=0;
        int score=0;
        Arrays.sort(tokens);
        int left=0;
        int right=tokens.length-1;
        while(left<=right){
            if(power>=tokens[left]){
                power-=tokens[left];
                score+=1;
                left++;
                max = Math.max(max, score);
            } else if(score>0){
                score-=1;
                power+=tokens[right];
                right--;
            } else{
                break;
            }
        }
        return max;
    }
}