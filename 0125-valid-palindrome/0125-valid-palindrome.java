class Solution {
    public boolean isPalindrome(String s) {
        Deque<Character> d=new ArrayDeque<>();
        s=s.toLowerCase();
        for(char c:s.toCharArray()){
            if(c>='a' && c<='z'|| (c >= '0' && c <= '9')){
                d.addFirst(c);
            }
        }

        while(d.size()>1){
            if(d.getFirst() != d.getLast()){
                return false;
            }
            d.removeFirst();
            d.removeLast();
        }
        return true;
    }
}