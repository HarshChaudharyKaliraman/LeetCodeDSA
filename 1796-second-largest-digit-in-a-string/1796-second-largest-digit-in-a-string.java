class Solution {
    public int secondHighest(String s) {
        int max=-1;
        int sec=-1;

        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                int ch = s.charAt(i)-'0';
                if(ch>max){
                    sec=max;
                    max=ch;
                }else if(ch>sec && ch<max){
                    sec=ch;
                }
            }
        }
        return sec;
    }
}