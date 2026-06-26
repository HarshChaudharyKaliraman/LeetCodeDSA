class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> m = new HashMap<>();

        for(char c:s.toCharArray()){
            m.put(c, m.getOrDefault(c, 0)+1);
        }

        char ans='a';
        int sd=0;
        for(char c:s.toCharArray()){
            if(m.get(c)==1){
                ans=c;
                sd=1;
                break;
            }
        }
        if(sd==0){
            return -1;
        }
        for(int i=0; i<s.length(); i++){
            if(ans==s.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}