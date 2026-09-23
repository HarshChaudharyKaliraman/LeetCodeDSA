class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> dq = new ArrayDeque<>();
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                dq.addFirst(s.charAt(i));
            }
        }
        while(dq.size()>1){
            if(dq.getFirst()!=dq.getLast()){
                return false;
            }
            dq.removeFirst();
            dq.removeLast();
        }
        return true;
    }
}