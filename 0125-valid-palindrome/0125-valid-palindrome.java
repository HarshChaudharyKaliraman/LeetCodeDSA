class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> d = new ArrayDeque<>();
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                d.addFirst(s.charAt(i));
            }
        }
        while(d.size()>1){
            if(d.getFirst()!=d.getLast()){
                return false;
            }
            d.removeFirst();
            d.removeLast();
        }
        return true;
    }
}